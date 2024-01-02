package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.NoiseHour;
import earth.tiangong.backend.mapper.NoiseHourMapper;
import earth.tiangong.backend.service.INoiseHourService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 噪声小时数据表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class NoiseHourServiceImpl extends ServiceImpl<NoiseHourMapper, NoiseHour> implements INoiseHourService {

}
