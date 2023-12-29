package earth.tiangong.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import earth.tiangong.backend.entity.DemoEmployee;
import earth.tiangong.backend.mapper.DemoEmployeeMapper;
import earth.tiangong.backend.model.DemoEmployeeGridFilter;
import earth.tiangong.backend.model.GridData;
import earth.tiangong.backend.service.IDemoEmployeeService;
import earth.tiangong.backend.util.ColumnNameUtil;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2023-12-27
 */
@Service
public class DemoEmployeeServiceImpl extends ServiceImpl<DemoEmployeeMapper, DemoEmployee> implements IDemoEmployeeService {
@Autowired
    DemoEmployeeMapper demoEmployeeMapper;

    public String[] gridColumns = { "id", "first_name", "last_name", "date_of_birth" };

    public GridData<DemoEmployee> getGrid(DemoEmployeeGridFilter filter) {
        QueryWrapper<DemoEmployee> queryWrapper = new QueryWrapper<DemoEmployee>();
        if (filter.getFirstName() != null && !filter.getFirstName().trim().equals(""))
            queryWrapper.like(ColumnNameUtil.toDatabaseName("firstName"), filter.getFirstName());
        if (filter.getLastName() != null && !filter.getLastName().trim().equals(""))
            queryWrapper.eq(ColumnNameUtil.toDatabaseName("lastName"), filter.getLastName());
        
        if (filter.getSortBy() != null && !filter.getSortBy().equals("")) {
            if (filter.getOrderBy().equals("desc")) {
                queryWrapper.orderByDesc(ColumnNameUtil.toDatabaseName(filter.getSortBy()));
            } else if (filter.getOrderBy().equals("asc")) {
                queryWrapper.orderByAsc(ColumnNameUtil.toDatabaseName(filter.getSortBy()));
            }
        }
        queryWrapper.select(gridColumns);
        Page<DemoEmployee> page = new Page<>(filter.getCurrent(), filter.getPageSize());
        Page<DemoEmployee> resultPage = demoEmployeeMapper.selectPage(page, queryWrapper);
        GridData<DemoEmployee> gridData = new GridData<DemoEmployee>(resultPage.getRecords(), resultPage.getTotal(), resultPage.getCurrent(), resultPage.getSize(), true);
        return gridData;
    }

    @Transactional
    public String create(DemoEmployee data) {
        try {
            // data.setId(UUID.randomUUID().toString());
            return demoEmployeeMapper.insert(data) == 1 ? "{\"data\": \"ok\"}" : "{\"data\": \"err\"}";
        } catch (Exception e) {
            return "{\"data\": \""+ e.getMessage() +"\"}";
        }
    }

    @Transactional
    public String update(DemoEmployee data) {
        try {
            return demoEmployeeMapper.updateById(data) == 1 ? "{\"data\": \"ok\"}" : "{\"data\": \"err\"}";
        } catch (Exception e) {
            return "{\"data\": \""+ e.getMessage() +"\"}";
        }
    }

    @Transactional
    public String delete(String id) {
        try {
            return demoEmployeeMapper.deleteById(id) == 1 ? "{\"data\": \"ok\"}" : "{\"data\": \"err\"}";
        } catch (Exception e) {
            return "{\"data\": \""+ e.getMessage() +"\"}";
        }
    }

    public DemoEmployee getById(String id) {

        // QueryWrapper<DemoEmployee> queryWrapper = new QueryWrapper<DemoEmployee>();
        // queryWrapper.eq(ColumnNameUtil.toDatabaseName("id"), id);
        // queryWrapper.select(gridColumns);
        // DemoEmployee data = demoEmployeeMapper.selectOne(queryWrapper);
        // return data;

        return demoEmployeeMapper.selectById(id);
    }

    public DemoEmployee getByName(String firstName, String lastName) {
        QueryWrapper<DemoEmployee> queryWrapper = new QueryWrapper<DemoEmployee>();
        queryWrapper.like(ColumnNameUtil.toDatabaseName("firstName"), firstName);
        queryWrapper.eq(ColumnNameUtil.toDatabaseName("lastName"), lastName);
        queryWrapper.select(gridColumns);
        DemoEmployee data = demoEmployeeMapper.selectOne(queryWrapper);
        return data;
    }

}
