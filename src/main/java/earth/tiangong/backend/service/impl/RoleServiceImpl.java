package earth.tiangong.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import earth.tiangong.backend.entity.Role;
import earth.tiangong.backend.mapper.RoleMapper;
import earth.tiangong.backend.service.IRoleService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2022-02-13
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
    @Autowired
    RoleMapper roleMapper;

    public Role getById(String id) {
        return roleMapper.selectById(id);
    }
}