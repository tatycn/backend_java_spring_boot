package earth.tiangong.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 站点表
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@TableName("public.t_station")
public class Station implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 站点编码
     */
    private String stationCode;

    /**
     * 站点名称
     */
    private String stationName;

    /**
     * 省
     */
    private String provinceCode;

    /**
     * 市
     */
    private String cityCode;

    /**
     * 区/县
     */
    private String districtCode;

    /**
     * 镇/街
     */
    private String townCode;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 地址
     */
    private String address;

    /**
     * 供电情况;市电/电池
     */
    private String powerInfo;

    /**
     * 使用情况;在用/停用/已搬
     */
    private String useInfo;

    /**
     * 创建人
     */
    private String createdUser;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新人
     */
    private String updatedUser;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getPowerInfo() {
        return powerInfo;
    }

    public void setPowerInfo(String powerInfo) {
        this.powerInfo = powerInfo;
    }
    public String getUseInfo() {
        return useInfo;
    }

    public void setUseInfo(String useInfo) {
        this.useInfo = useInfo;
    }
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "Station{" +
            "stationCode=" + stationCode +
            ", stationName=" + stationName +
            ", provinceCode=" + provinceCode +
            ", cityCode=" + cityCode +
            ", districtCode=" + districtCode +
            ", townCode=" + townCode +
            ", longitude=" + longitude +
            ", latitude=" + latitude +
            ", address=" + address +
            ", powerInfo=" + powerInfo +
            ", useInfo=" + useInfo +
            ", createdUser=" + createdUser +
            ", createdTime=" + createdTime +
            ", updatedUser=" + updatedUser +
            ", updatedTime=" + updatedTime +
        "}";
    }
}
