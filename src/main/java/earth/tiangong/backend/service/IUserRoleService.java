package earth.tiangong.backend.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import earth.tiangong.backend.entity.Role;
import earth.tiangong.backend.entity.UserRole;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author TianGong
 * @since 2022-02-13
 */
public interface IUserRoleService extends IService<UserRole> {
    
    List<Role> getRoleByUserId(String userId);

}
