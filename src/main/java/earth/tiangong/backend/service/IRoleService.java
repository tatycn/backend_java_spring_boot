package earth.tiangong.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;

import earth.tiangong.backend.entity.Role;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author TianGong
 * @since 2022-02-13
 */
public interface IRoleService extends IService<Role> {
    Role getById(String id);
}
