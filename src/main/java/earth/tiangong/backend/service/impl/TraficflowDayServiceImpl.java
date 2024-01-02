package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.TraficflowDay;
import earth.tiangong.backend.mapper.TraficflowDayMapper;
import earth.tiangong.backend.service.ITraficflowDayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车流量日均数据表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class TraficflowDayServiceImpl extends ServiceImpl<TraficflowDayMapper, TraficflowDay> implements ITraficflowDayService {

}
