package earth.tiangong.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;

import earth.tiangong.backend.entity.UserView;
import earth.tiangong.backend.model.GridData;
import earth.tiangong.backend.model.UserGridFilter;

public interface IUserViewService extends IService<UserView> {
    UserView getById(String id);

    GridData<UserView> getGrid(UserGridFilter filter);
}
