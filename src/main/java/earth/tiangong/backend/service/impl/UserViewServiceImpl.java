package earth.tiangong.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import earth.tiangong.backend.entity.UserView;
import earth.tiangong.backend.mapper.UserViewMapper;
import earth.tiangong.backend.model.GridData;
import earth.tiangong.backend.model.UserGridFilter;
import earth.tiangong.backend.service.IUserViewService;
import earth.tiangong.backend.util.ColumnNameUtil;

@Service
public class UserViewServiceImpl extends ServiceImpl<UserViewMapper, UserView>
        implements IUserViewService {
    @Autowired
    UserViewMapper userViewMapper;

    public UserView getById(String id) {
        return userViewMapper.selectById(id);
    }

    @Override
    public GridData<UserView> getGrid(UserGridFilter filter) {
        QueryWrapper<UserView> queryWrapper = new QueryWrapper<UserView>();
        if (filter.getName() != null && !filter.getName().trim().equals(""))
            queryWrapper.like(ColumnNameUtil.toDatabaseName("name"), filter.getName());
        if (filter.getSortBy() != null && !filter.getSortBy().equals("")) {
            if (filter.getOrderBy().equals("desc")) {
                queryWrapper.orderByDesc(ColumnNameUtil.toDatabaseName(filter.getSortBy()));
            } else if (filter.getOrderBy().equals("asc")) {
                queryWrapper.orderByAsc(ColumnNameUtil.toDatabaseName(filter.getSortBy()));
            }
        }
        Page<UserView> page = new Page<>(filter.getCurrent(), filter.getPageSize());
        Page<UserView> resultPage = userViewMapper.selectPage(page, queryWrapper);
        GridData<UserView> gridData = new GridData<UserView>(resultPage.getRecords(), resultPage.getTotal(),
                resultPage.getCurrent(), resultPage.getSize(), true);
        return gridData;
    }

}
