package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.TraficflowMinute;
import earth.tiangong.backend.mapper.TraficflowMinuteMapper;
import earth.tiangong.backend.service.ITraficflowMinuteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车流量分钟数据表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class TraficflowMinuteServiceImpl extends ServiceImpl<TraficflowMinuteMapper, TraficflowMinute> implements ITraficflowMinuteService {

}
