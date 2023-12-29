package earth.tiangong.backend.security.impl;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import earth.tiangong.backend.entity.User;
import earth.tiangong.backend.security.exception.ServiceException;
import earth.tiangong.backend.security.model.LoginUser;
import earth.tiangong.backend.security.util.StringUtils;
import earth.tiangong.backend.service.IUserService;

/**
 * 用户验证处理
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserService iUsersService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = iUsersService.getByEmail(username, true);
        if (StringUtils.isNull(user)) {
            throw new ServiceException("登录用户：" + username + " 不存在");
        } else if (user.getIsDeleted() != null && user.getIsDeleted()) {
            throw new ServiceException("对不起，您的账号：" + username + " 已停用");
        }

        return createLoginUser(user);
    }

    public UserDetails createLoginUser(User user) {
        return new LoginUser(user);
    }
}
