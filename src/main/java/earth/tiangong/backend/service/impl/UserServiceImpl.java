package earth.tiangong.backend.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import earth.tiangong.backend.entity.User;
import earth.tiangong.backend.mapper.UserMapper;
import earth.tiangong.backend.service.IUserService;
import earth.tiangong.backend.util.ColumnNameUtil;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2022-02-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper UserMapper;

    public User getById(String id) {
        return UserMapper.selectById(id);
    }

    public User getByTokenKey(String tokenKey) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("tokenKey"), tokenKey);
        return UserMapper.selectOne(queryWrapper);
    }

    public User getByName(String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("name"), name);
        return UserMapper.selectOne(queryWrapper);
    }

    public User getByEmail(String email) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("email"), email);
        return UserMapper.selectOne(queryWrapper);
    }

    public User getByEmail(String email, boolean isRegistered) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("email"), email);
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("isRegistered"), isRegistered);
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("isDeleted"), false);
        return UserMapper.selectOne(queryWrapper);
    }

    public void updateLoginTimeById(String id) {
        User sysUser = getById(id);
        Date date = new Date();
        sysUser.setLoginTime(new Timestamp(date.getTime()));
        UserMapper.updateById(sysUser);
    }

    public void updateTokenExpireTime(String tokenKey, Timestamp tokenExpireTime) {
        User sysUser = getByTokenKey(tokenKey);
        sysUser.setTokenExpireTime(tokenExpireTime);
        UserMapper.updateById(sysUser);
    }

    public void updateTokenKey(String id, String tokenKey) {
        User sysUser = getById(id);
        sysUser.setTokenKey(tokenKey);
        UserMapper.updateById(sysUser);
    }

    public void deleteTokenKey(String tokenKey) {
        User sysUser = getByTokenKey(tokenKey);
        sysUser.setTokenKey("");
        sysUser.setTokenExpireTime(new Timestamp(0));
        UserMapper.updateById(sysUser);
    }

    @Transactional
    public String create(User data) {
        try {
            Date date = new Date();
            data.setCreateTime(new Timestamp(date.getTime()));
            data.setIsDeleted(false);
            return UserMapper.insert(data) == 1 ? "ok" : "err";
        } catch (Exception e) {
            return "{\"data\": \""+ e.getMessage() +"\"}";
        }
    }

    @Transactional
    public String createRegister(String email, String registerCode) {
        try {
            Date date = new Date();
            User user = new User();
            user.setEmail(email);
            user.setName(email.split("@")[0]);
            user.setRegisterCode(registerCode);
            user.setIsRegistered(false);
            user.setIsDeleted(false);
            user.setCreateTime(new Timestamp(date.getTime()));
            user.setLoginTime(new Timestamp(date.getTime()));
            return UserMapper.insert(user) == 1 ? "ok" : "err";
        } catch (Exception e) {
            return "{\"data\": \""+ e.getMessage() +"\"}";
        }
    }

    @Transactional
    public String update(User data) {
        try {
            return UserMapper.updateById(data) == 1 ? "ok" : "err";
        } catch (Exception e) {
            return "{\"data\": \""+ e.getMessage() +"\"}";
        }
    }

    @Transactional
    public String delete(String id) {
        try {
            return UserMapper.deleteById(id) == 1 ? "ok" : "err";
        } catch (Exception e) {
            return "{\"data\": \""+ e.getMessage() +"\"}";
        }
    }

}