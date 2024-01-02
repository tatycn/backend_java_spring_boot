package earth.tiangong.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 站点设备表
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@TableName("public.t_station_devices")
public class StationDevices implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 站点编码
     */
    private String stationCode;

    /**
     * 设备编码
     */
    private String deviceCode;

    /**
     * 开始时间
     */
    private LocalDateTime startTimepoint;

    /**
     * 结束时间
     */
    private LocalDateTime endTimepoint;

    /**
     * 版本号
     */
    private Integer rowVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }
    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }
    public LocalDateTime getStartTimepoint() {
        return startTimepoint;
    }

    public void setStartTimepoint(LocalDateTime startTimepoint) {
        this.startTimepoint = startTimepoint;
    }
    public LocalDateTime getEndTimepoint() {
        return endTimepoint;
    }

    public void setEndTimepoint(LocalDateTime endTimepoint) {
        this.endTimepoint = endTimepoint;
    }
    public Integer getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }

    @Override
    public String toString() {
        return "StationDevices{" +
            "id=" + id +
            ", stationCode=" + stationCode +
            ", deviceCode=" + deviceCode +
            ", startTimepoint=" + startTimepoint +
            ", endTimepoint=" + endTimepoint +
            ", rowVersion=" + rowVersion +
        "}";
    }
}
