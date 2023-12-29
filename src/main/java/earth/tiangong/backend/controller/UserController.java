package earth.tiangong.backend.controller;

import static org.springframework.http.ResponseEntity.*;

import java.sql.Timestamp;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import earth.tiangong.backend.entity.User;
import earth.tiangong.backend.entity.UserView;
import earth.tiangong.backend.model.ApiLoginCode;
import earth.tiangong.backend.model.ChangeEmail;
import earth.tiangong.backend.model.ChangePassword;
import earth.tiangong.backend.model.GridData;
import earth.tiangong.backend.model.SetPasswordBody;
import earth.tiangong.backend.model.UserGridFilter;
import earth.tiangong.backend.security.exception.AjaxResult;
import earth.tiangong.backend.security.model.LoginBody;
import earth.tiangong.backend.security.service.LoginService;
import earth.tiangong.backend.security.util.Constants;
import earth.tiangong.backend.security.util.SecurityUtils;
import earth.tiangong.backend.service.IUserService;
import earth.tiangong.backend.service.IUserViewService;
import earth.tiangong.backend.util.RandomStringUtil;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private IUserService iUserService;
    @Autowired
    private IUserViewService iUserViewService;

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendRegisterCode(String emailTo, String code) throws Exception {
        MimeMessage mimeMailMessage = this.javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMailMessage, true, "utf-8");
            messageHelper.setFrom("service@misai.tech");
            messageHelper.setTo(emailTo);
            messageHelper.setSubject("注册XXXX账号邮件验证码");
            String emailContent = new StringBuilder()
                    .append("<div style=\"padding:30px;\">")
                    .append("<div style=\"color:#777777;font-size:26px;font-weight:400;line-height:37px;\">您正在注册XXXX账号</div>")
                    .append("<div style=\"color:#777777;font-size:14px;line-height:20px;margin-top:6px;\">请填写下方8位验证码完成注册</div>")
                    .append("<div style=\"margin-top:15px;\">")
                    .append("<span style=\"background-color:#108ee9;font-size:18px;color:white;padding:6px 12px 6px 28px;letter-spacing:16px;display:inline-block;\">")
                    .append(code)
                    .append("</span>")
                    .append("</div>")
                    .toString();
            messageHelper.setText(emailContent, true);
            javaMailSender.send(mimeMailMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody) {
        try {
            // 生成令牌
            String token = loginService.login(loginBody.getUserName(), loginBody.getPassword());
            AjaxResult ajax = AjaxResult.success();
            ajax.put(Constants.TOKEN, token);
            return ajax;
        } catch (Exception e) {
            AjaxResult ajax = AjaxResult.error();
            return ajax;
        }
    }

    @GetMapping("/getCode")
    public ResponseEntity<?> getCode() {
        User currentUser = SecurityUtils.getLoginUser().getUser();
        Date date = new Date();
        Long nowDT = date.getTime();
        Long loginDT = currentUser.getLoginTime().getTime();
        Long DT = (nowDT - loginDT) / 1000;

        if (DT > 60) {
            String code = RandomStringUtil.getRandomString(8);
            try {
                sendRegisterCode(currentUser.getEmail(), code);
                currentUser.setLoginTime(new Timestamp(nowDT));
                currentUser.setRegisterCode(code);
                iUserService.update(currentUser);
            } catch (Exception e) {
                return ok("err:SendEmailFailed");
            }
        }
        return ok("ok");
    }

    @GetMapping("/getCode/{email}")
    public ResponseEntity<?> getCode(@PathVariable String email) {
        try {
            User user1 = iUserService.getByEmail(email, true);
            if (user1 != null)
                return ok("err:EmailRegistered");

            User user2 = iUserService.getByEmail(email, false);
            Date date = new Date();
            Long nowdt = date.getTime();
            if (user2 != null) {
                Long logindt = user2.getLoginTime().getTime();
                Long dt = (nowdt - logindt) / 1000;
                if (dt > 60) {
                    String code = RandomStringUtil.getRandomString(8);
                    sendRegisterCode(email, code);
                    user2.setLoginTime(new Timestamp(nowdt));
                    user2.setRegisterCode(code);
                    iUserService.update(user2);
                }
                return ok("ok");
            } else {
                String code = RandomStringUtil.getRandomString(8);
                sendRegisterCode(email, code);
                return ok(iUserService.createRegister(email, code));
            }
        } catch (Exception e) {
            return ok(e.getMessage());
        }
    }

    @PutMapping("/register")
    public ResponseEntity<?> register(@RequestBody SetPasswordBody setPasswordBody) {
        if (setPasswordBody.getEmail() == null || setPasswordBody.getEmail().isEmpty())
            return ok("err:EmailEmpty");
        if (setPasswordBody.getRegisterCode() == null || setPasswordBody.getRegisterCode().isEmpty())
            return ok("err:RegisterCodeEmpty");
        if (setPasswordBody.getNewpwd() == null || setPasswordBody.getNewpwd().isEmpty())
            return ok("err:PasswordEmpty");
        if (setPasswordBody.getNewpwd2() == null || setPasswordBody.getNewpwd2().isEmpty())
            return ok("err:PasswordEmpty");
        if (!setPasswordBody.getNewpwd().equals(setPasswordBody.getNewpwd2()))
            return ok("err:PasswordNotMatch");
        try {
            User user1 = iUserService.getByEmail(setPasswordBody.getEmail(), true);
            if (user1 != null)
                return ok("err:EmailRegistered");
            User user2 = iUserService.getByEmail(setPasswordBody.getEmail(), false);
            if (user2 != null) {
                Date date = new Date();
                Long nowdt = date.getTime();
                Long logindt = user2.getLoginTime().getTime();
                Long dt = (nowdt - logindt) / 1000;
                if (dt < 600) {
                    if (!setPasswordBody.getRegisterCode().equals(user2.getRegisterCode()))
                        return ok("err:RegisterCodeWrong");
                    user2.setLoginTime(new Timestamp(nowdt));
                    user2.setPassword(SecurityUtils.encryptPassword(setPasswordBody.getNewpwd()));
                    user2.setIsRegistered(true);
                    user2.setIsDeleted(false);
                    user2.setRegisterCode(null);
                    iUserService.update(user2);
                    return ok("ok");
                } else {
                    return ok("err:RegisterCodeExpired");
                }
            } else {
                return ok("err");
            }
        } catch (Exception e) {
            return ok("err");
        }
    }

    @GetMapping("/register/getCode/{email}")
    public ResponseEntity<?> registerGetCode(@PathVariable String email) {
        try {
            User user1 = iUserService.getByEmail(email, true);
            if (user1 != null)
                return ok("err:EmailRegistered");

            User user2 = iUserService.getByEmail(email, false);
            Date date = new Date();
            Long nowdt = date.getTime();
            if (user2 != null) {
                Long logindt = user2.getLoginTime().getTime();
                Long dt = (nowdt - logindt) / 1000;
                if (dt > 60) {
                    String code = RandomStringUtil.getRandomString(8);
                    sendRegisterCode(email, code);
                    user2.setLoginTime(new Timestamp(nowdt));
                    user2.setRegisterCode(code);
                    iUserService.update(user2);
                }
                return ok("ok");
            } else {
                String code = RandomStringUtil.getRandomString(8);
                sendRegisterCode(email, code);
                return ok(iUserService.createRegister(email, code));
            }
        } catch (Exception e) {
            return ok(e.getMessage());
        }
    }

    @PostMapping("/current")
    public ResponseEntity<User> current() {
        User sysUser = SecurityUtils.getLoginUser().getUser();
        User currentUser = new User();
        currentUser.setId(sysUser.getId());
        currentUser.setName(sysUser.getName());
        return ok(currentUser);
    }

    @GetMapping("/baseinfo")
    public ResponseEntity<User> getCurrentUserBaseInfo() {
        User sysUser = SecurityUtils.getLoginUser().getUser();
        User currentUser = new User();
        currentUser.setId(sysUser.getId());
        currentUser.setName(sysUser.getName());
        currentUser.setEmail(sysUser.getEmail());
        currentUser.setPhone(sysUser.getPhone());
        currentUser.setDescription(sysUser.getDescription());
        return ok(currentUser);
    }

    // @PreAuthorize("@ss.hasAnyRoles( 'admin,user' )")
    @ApiOperation(value = "grid")
    @GetMapping("/grid")
    public ResponseEntity<GridData<UserView>> getGrid(UserGridFilter filter) throws Exception {
        filter = filter == null ? new UserGridFilter() : filter;
        GridData<UserView> result = iUserViewService.getGrid(filter);
        return ok(result);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody User data) {
        return ok(iUserService.create(data));
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateCurrentUserInfo(@RequestBody User data) {
        User currentUser = SecurityUtils.getLoginUser().getUser();
        currentUser.setName(data.getName());
        currentUser.setPhone(data.getPhone());
        currentUser.setDescription(data.getDescription());
        return ok(iUserService.update(currentUser));
    }

    @PutMapping("/changePassword")
    public ResponseEntity<String> changeCurrentUserPassword(@RequestBody ChangePassword data) {
        User currentUser = SecurityUtils.getLoginUser().getUser();
        String checkPwd = data.checkPwd(currentUser.getPassword());
        if (checkPwd.equals("ok")) {
            currentUser.setPassword(SecurityUtils.encryptPassword(data.getNewpwd()));
            return ok(iUserService.update(currentUser));
        } else
            return ok(checkPwd);
    }

    @PutMapping("/resetPassword")
    public ResponseEntity<String> resetPassword(@RequestBody SetPasswordBody setPasswordBody) {
        if (setPasswordBody.getEmail() == null || setPasswordBody.getEmail().isEmpty())
            return ok("err:EmailEmpty");
        if (setPasswordBody.getRegisterCode() == null || setPasswordBody.getRegisterCode().isEmpty())
            return ok("err:RegisterCodeEmpty");
        if (setPasswordBody.getNewpwd() == null || setPasswordBody.getNewpwd().isEmpty())
            return ok("err:PasswordEmpty");
        if (setPasswordBody.getNewpwd2() == null || setPasswordBody.getNewpwd2().isEmpty())
            return ok("err:PasswordEmpty");
        if (!setPasswordBody.getNewpwd().equals(setPasswordBody.getNewpwd2()))
            return ok("err:PasswordNotMatch");
        try {
            User user1 = iUserService.getByEmail(setPasswordBody.getEmail(), true);
            if (user1 == null)
                return ok("err:EmailUnregistered");
            else{
                Date date = new Date();
                Long nowdt = date.getTime();
                Long logindt = user1.getLoginTime().getTime();
                Long dt = (nowdt - logindt) / 1000;
                if (dt < 600) {
                    if (!setPasswordBody.getRegisterCode().equals(user1.getRegisterCode()))
                        return ok("err:RegisterCodeWrong");
                    user1.setLoginTime(new Timestamp(nowdt));
                    user1.setPassword(SecurityUtils.encryptPassword(setPasswordBody.getNewpwd()));
                    user1.setRegisterCode(null);
                    iUserService.update(user1);
                    return ok("ok");
                } else {
                    return ok("err:RegisterCodeExpired");
                }
            }
        } catch (Exception e) {
            return ok("err");
        }
    }

    @GetMapping("/resetPassword/getCode/{email}")
    public ResponseEntity<?> resetPasswordGetCode(@PathVariable String email) {
        try {
            User user1 = iUserService.getByEmail(email, true);
            if (user1 == null)
                return ok("err:EmailUnregistered");
            else {
                Date date = new Date();
                Long nowdt = date.getTime();

                Long logindt = user1.getLoginTime().getTime();
                Long dt = (nowdt - logindt) / 1000;
                if (dt > 60) {
                    String code = RandomStringUtil.getRandomString(8);
                    sendRegisterCode(email, code);
                    user1.setLoginTime(new Timestamp(nowdt));
                    user1.setRegisterCode(code);
                    iUserService.update(user1);
                }
                return ok("ok");
            }
        } catch (Exception e) {
            return ok(e.getMessage());
        }
    }

    @PutMapping("/changeEmail")
    public ResponseEntity<String> changeCurrentUserEmail(@RequestBody ChangeEmail data) {
        if (!data.isSame()) {
            User currentUser = SecurityUtils.getLoginUser().getUser();
            if (data.checkPwd(currentUser.getPassword())) {
                try {
                    Date date = new Date();
                    Long nowDT = date.getTime();
                    Long currentLoginDT = currentUser.getLoginTime().getTime();
                    Long currentDT = (nowDT - currentLoginDT) / 1000;

                    if (currentDT < 600) {
                        if (!data.getRegisterCode().equals(currentUser.getRegisterCode()))
                            return ok("err:RegisterCodeWrong");
                        User user1 = iUserService.getByEmail(data.getNewEmail(), true);
                        if (user1 != null)
                            return ok("err:EmailRegistered");
                        User user2 = iUserService.getByEmail(data.getNewEmail(), false);
                        if (user2 != null) {
                            Long newLoginDT = user2.getLoginTime().getTime();
                            Long newDT = (nowDT - newLoginDT) / 1000;
                            if (newDT < 600) {
                                if (!data.getNewRegisterCode().equals(user2.getRegisterCode()))
                                    return ok("err:RegisterCodeWrong");
                                currentUser.setLoginTime(new Timestamp(nowDT));
                                currentUser.setEmail(data.getNewEmail());
                                currentUser.setRegisterCode(null);
                                iUserService.update(currentUser);
                                return ok("ok");
                            } else {
                                return ok("err:RegisterCodeExpired");
                            }
                        } else {
                            return ok("err");
                        }
                    } else {
                        return ok("err:RegisterCodeExpired");
                    }
                } catch (Exception e) {
                    return ok("err");
                }
            }
            return ok("err:PasswordWrong");
        }
        return ok("err:EmailSame");
    }

    @PostMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody User data) {
        data.setIsDeleted(true);
        return ok(iUserService.update(data));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserView> getById(@PathVariable Long id) {
        return ok(iUserViewService.getById(id));
    }

    @GetMapping("/getApiLoginCode")
    public ResponseEntity<ApiLoginCode> getApiLoginCodeById() {
        User currentUser = SecurityUtils.getLoginUser().getUser();
        String currentCode = currentUser.getApiLoginCode();
        if (currentCode == null || currentCode.trim().equals("")) {
            currentCode = RandomStringUtil.getRandomString(8);
            currentUser.setApiLoginCode(currentCode);
            iUserService.update(currentUser);
        }
        return ok(new ApiLoginCode(currentUser.getId(), currentCode));
    }

    // 不需要登录
    @GetMapping("/checkApiLoginCode/{userId}/{apiLoginCode}")
    public ResponseEntity<String> getApiLoginCodeById(@PathVariable Long userId, @PathVariable String apiLoginCode) {
        User currentUser = iUserService.getById(userId);
        String currentCode = currentUser.getApiLoginCode();
        currentUser.setApiLoginCode(RandomStringUtil.getRandomString(8));
        if (iUserService.update(currentUser).equals("ok")) {
            if (apiLoginCode.equals(currentCode))
                return ok("ok");
        }
        return ok("err");
    }
}
