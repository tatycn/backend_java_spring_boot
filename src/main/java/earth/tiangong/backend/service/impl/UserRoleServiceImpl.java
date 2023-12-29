package earth.tiangong.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import earth.tiangong.backend.entity.Role;
import earth.tiangong.backend.entity.UserRole;
import earth.tiangong.backend.mapper.UserRoleMapper;
import earth.tiangong.backend.service.IRoleService;
import earth.tiangong.backend.service.IUserRoleService;
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
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
        implements IUserRoleService {
    @Autowired
    UserRoleMapper userRolesMapper;

    public List<UserRole> getByUserId(String userId) {
        QueryWrapper<UserRole> queryWrapper = new QueryWrapper<UserRole>();
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("userId"), userId);
        return userRolesMapper.selectList(queryWrapper);
    }

    @Autowired
    IRoleService iRoleService;

    public List<Role> getRoleByUserId(String userId) {
        List<UserRole> userRoles = getByUserId(userId);
        List<Role> roles = new ArrayList<>();
        for (UserRole userRole : userRoles) {
            Role role = iRoleService.getById(userRole.getRoleId());
            roles.add(role);
        }
        return roles;
    }
}