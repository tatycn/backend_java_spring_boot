package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.NoiseSecond;
import earth.tiangong.backend.mapper.NoiseSecondMapper;
import earth.tiangong.backend.service.INoiseSecondService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 噪声实时数据表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class NoiseSecondServiceImpl extends ServiceImpl<NoiseSecondMapper, NoiseSecond> implements INoiseSecondService {

}
