package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.Device;
import earth.tiangong.backend.mapper.DeviceMapper;
import earth.tiangong.backend.service.IDeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 设备表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements IDeviceService {

}
