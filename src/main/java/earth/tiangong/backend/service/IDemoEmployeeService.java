package earth.tiangong.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;

import earth.tiangong.backend.entity.DemoEmployee;
import earth.tiangong.backend.model.DemoEmployeeGridFilter;
import earth.tiangong.backend.model.GridData;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author TianGong
 * @since 2023-12-27
 */
public interface IDemoEmployeeService extends IService<DemoEmployee> {
    GridData<DemoEmployee> getGrid(DemoEmployeeGridFilter filter);

    String create(DemoEmployee data);

    String update(DemoEmployee data);

    String delete(String id);

    DemoEmployee getById(String id);

    DemoEmployee getByName(String firstName, String lastName);

}
