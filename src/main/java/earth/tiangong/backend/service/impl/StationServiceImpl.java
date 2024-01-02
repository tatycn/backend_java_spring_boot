package earth.tiangong.backend.service.impl;

import earth.tiangong.backend.entity.Station;
import earth.tiangong.backend.mapper.StationMapper;
import earth.tiangong.backend.service.IStationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 站点表 服务实现类
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@Service
public class StationServiceImpl extends ServiceImpl<StationMapper, Station> implements IStationService {

}
