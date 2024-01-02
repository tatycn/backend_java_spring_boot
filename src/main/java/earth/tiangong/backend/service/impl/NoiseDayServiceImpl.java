package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.NoiseDay;
import earth.tiangong.backend.mapper.NoiseDayMapper;
import earth.tiangong.backend.service.INoiseDayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 噪声日均数据表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class NoiseDayServiceImpl extends ServiceImpl<NoiseDayMapper, NoiseDay> implements INoiseDayService {

}
