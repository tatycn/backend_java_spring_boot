package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.NoiseMinute;
import earth.tiangong.backend.mapper.NoiseMinuteMapper;
import earth.tiangong.backend.service.INoiseMinuteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 噪声分钟数据表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class NoiseMinuteServiceImpl extends ServiceImpl<NoiseMinuteMapper, NoiseMinute> implements INoiseMinuteService {

}
