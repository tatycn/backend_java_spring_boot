package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.NoiseAlarm;
import earth.tiangong.backend.mapper.NoiseAlarmMapper;
import earth.tiangong.backend.service.INoiseAlarmService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 噪声报警数据表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class NoiseAlarmServiceImpl extends ServiceImpl<NoiseAlarmMapper, NoiseAlarm> implements INoiseAlarmService {

}
