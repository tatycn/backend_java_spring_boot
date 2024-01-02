package earth.tiangong.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 设备表
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@TableName("public.t_device")
public class Device implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备编码
     */
    private String deviceCode;

    /**
     * 声级计
     */
    private String soundLevel;

    /**
     * 系统版本
     */
    private String systemVersion;

    /**
     * VPN地址
     */
    private String vpnAddress;

    /**
     * 流量卡号
     */
    private String dataCardNumber;

    /**
     * 设备情况;在线/离线
     */
    private String deviceInfo;

    /**
     * 启用情况;启用/禁用
     */
    private Boolean useInfo;

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

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }
    public String getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(String soundLevel) {
        this.soundLevel = soundLevel;
    }
    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }
    public String getVpnAddress() {
        return vpnAddress;
    }

    public void setVpnAddress(String vpnAddress) {
        this.vpnAddress = vpnAddress;
    }
    public String getDataCardNumber() {
        return dataCardNumber;
    }

    public void setDataCardNumber(String dataCardNumber) {
        this.dataCardNumber = dataCardNumber;
    }
    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
    public Boolean getUseInfo() {
        return useInfo;
    }

    public void setUseInfo(Boolean useInfo) {
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
        return "Device{" +
            "deviceCode=" + deviceCode +
            ", soundLevel=" + soundLevel +
            ", systemVersion=" + systemVersion +
            ", vpnAddress=" + vpnAddress +
            ", dataCardNumber=" + dataCardNumber +
            ", deviceInfo=" + deviceInfo +
            ", useInfo=" + useInfo +
            ", createdUser=" + createdUser +
            ", createdTime=" + createdTime +
            ", updatedUser=" + updatedUser +
            ", updatedTime=" + updatedTime +
        "}";
    }
}
