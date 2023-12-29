package earth.tiangong.backend.service;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.extension.service.IService;

import earth.tiangong.backend.entity.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author TianGong
 * @since 2022-02-13
 */
public interface IUserService extends IService<User> {

    User getById(String id);

    User getByTokenKey(String tokenKey);

    User getByName(String name);

    User getByEmail(String email);

    User getByEmail(String email, boolean isRegistered);

    void updateLoginTimeById(String id);

    void updateTokenExpireTime(String tokenKey, Timestamp tokenExpireTime);

    void deleteTokenKey(String tokenKey);

    void updateTokenKey(String id, String tokenKey);

    String create(User data);

    String createRegister(String email, String registerCode);

    String update(User data);

    String delete(String id);

}
