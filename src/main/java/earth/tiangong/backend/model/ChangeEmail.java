package earth.tiangong.backend.model;

import earth.tiangong.backend.security.util.SecurityUtils;

public class ChangeEmail {
    private String email;

    private String registerCode;

    private String newEmail;

    private String newRegisterCode;

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode == null ? null : registerCode.trim();
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail == null ? null : newEmail.trim();
    }

    public String getNewRegisterCode() {
        return newRegisterCode;
    }

    public void setNewRegisterCode(String newRegisterCode) {
        this.newRegisterCode = newRegisterCode == null ? null : newRegisterCode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public boolean isSame() {
        return email.equals(newEmail);
    }

    public boolean checkPwd(String pwd) {
        return SecurityUtils.matchesPassword(password, pwd);
    }
}
