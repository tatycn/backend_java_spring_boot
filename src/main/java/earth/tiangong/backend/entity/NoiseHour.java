package earth.tiangong.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 噪声小时数据表
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@TableName("public.t_noise_hour")
public class NoiseHour implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 站点编码
     */
    private String stationCode;

    /**
     * 设备编码
     */
    private String deviceCode;

    /**
     * 数据时间
     */
    private LocalDateTime timepoint;

    /**
     * 瞬时声级数据
     */
    private BigDecimal laData;

    /**
     * 瞬时声级数据-标记
     */
    private String laFlag;

    /**
     * 累计百分声级L5
     */
    private BigDecimal l5Data;

    /**
     * 累计百分声级L5-标记
     */
    private String l5Flag;

    /**
     * 累计百分声级L10
     */
    private BigDecimal l10Data;

    /**
     * 累计百分声级L10-标记
     */
    private String l10Flag;

    /**
     * 累计百分声级L50
     */
    private BigDecimal l50Data;

    /**
     * 累计百分声级L50-标记
     */
    private String l50Flag;

    /**
     * 累计百分声级L90
     */
    private BigDecimal l90Data;

    /**
     * 累计百分声级L90-标记
     */
    private String l90Flag;

    /**
     * 累计百分声级L95
     */
    private BigDecimal l95Data;

    /**
     * 累计百分声级L95-标记
     */
    private String l95Flag;

    /**
     * 等效声级
     */
    private BigDecimal leqData;

    /**
     * 等效声级-标记
     */
    private String leqFlag;

    /**
     * 昼夜等效声级
     */
    private BigDecimal ldnData;

    /**
     * 昼夜等效声级-标记
     */
    private String ldnFlag;

    /**
     * 昼间等效声级
     */
    private BigDecimal ldData;

    /**
     * 昼间等效声级-标记
     */
    private String ldFlag;

    /**
     * 夜间等效声级
     */
    private BigDecimal lnData;

    /**
     * 夜间等效声级-标记
     */
    private String lnFlag;

    /**
     * 最大瞬时声级
     */
    private BigDecimal lmxData;

    /**
     * 最大瞬时声级-标记
     */
    private String lmxFlag;

    /**
     * 最小瞬时声级
     */
    private BigDecimal lmnData;

    /**
     * 最小瞬时声级-标记
     */
    private String lmnFlag;

    /**
     * 标准差
     */
    private BigDecimal sdData;

    /**
     * 标准差-标记
     */
    private String sdFlag;

    /**
     * 有效采集率
     */
    private BigDecimal vdrData;

    /**
     * 有效采集率-标记
     */
    private String vdrFlag;

    /**
     * 温度
     */
    private BigDecimal a01001Data;

    /**
     * 温度-标记
     */
    private String a01001Flag;

    /**
     * 湿度
     */
    private BigDecimal a01002Data;

    /**
     * 湿度-标记
     */
    private String a01002Flag;

    /**
     * 气压
     */
    private BigDecimal a01006Data;

    /**
     * 气压-标记
     */
    private String a01006Flag;

    /**
     * 风速
     */
    private BigDecimal a01007Data;

    /**
     * 风速-标记
     */
    private String a01007Flag;

    /**
     * 风向
     */
    private BigDecimal a01008Data;

    /**
     * 风向-标记
     */
    private String a01008Flag;

    /**
     * 降水量
     */
    private BigDecimal a06001Data;

    /**
     * 降水量-标记
     */
    private String a06001Flag;

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
    public LocalDateTime getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(LocalDateTime timepoint) {
        this.timepoint = timepoint;
    }
    public BigDecimal getLaData() {
        return laData;
    }

    public void setLaData(BigDecimal laData) {
        this.laData = laData;
    }
    public String getLaFlag() {
        return laFlag;
    }

    public void setLaFlag(String laFlag) {
        this.laFlag = laFlag;
    }
    public BigDecimal getl5Data() {
        return l5Data;
    }

    public void setl5Data(BigDecimal l5Data) {
        this.l5Data = l5Data;
    }
    public String getl5Flag() {
        return l5Flag;
    }

    public void setl5Flag(String l5Flag) {
        this.l5Flag = l5Flag;
    }
    public BigDecimal getl10Data() {
        return l10Data;
    }

    public void setl10Data(BigDecimal l10Data) {
        this.l10Data = l10Data;
    }
    public String getl10Flag() {
        return l10Flag;
    }

    public void setl10Flag(String l10Flag) {
        this.l10Flag = l10Flag;
    }
    public BigDecimal getl50Data() {
        return l50Data;
    }

    public void setl50Data(BigDecimal l50Data) {
        this.l50Data = l50Data;
    }
    public String getl50Flag() {
        return l50Flag;
    }

    public void setl50Flag(String l50Flag) {
        this.l50Flag = l50Flag;
    }
    public BigDecimal getl90Data() {
        return l90Data;
    }

    public void setl90Data(BigDecimal l90Data) {
        this.l90Data = l90Data;
    }
    public String getl90Flag() {
        return l90Flag;
    }

    public void setl90Flag(String l90Flag) {
        this.l90Flag = l90Flag;
    }
    public BigDecimal getl95Data() {
        return l95Data;
    }

    public void setl95Data(BigDecimal l95Data) {
        this.l95Data = l95Data;
    }
    public String getl95Flag() {
        return l95Flag;
    }

    public void setl95Flag(String l95Flag) {
        this.l95Flag = l95Flag;
    }
    public BigDecimal getLeqData() {
        return leqData;
    }

    public void setLeqData(BigDecimal leqData) {
        this.leqData = leqData;
    }
    public String getLeqFlag() {
        return leqFlag;
    }

    public void setLeqFlag(String leqFlag) {
        this.leqFlag = leqFlag;
    }
    public BigDecimal getLdnData() {
        return ldnData;
    }

    public void setLdnData(BigDecimal ldnData) {
        this.ldnData = ldnData;
    }
    public String getLdnFlag() {
        return ldnFlag;
    }

    public void setLdnFlag(String ldnFlag) {
        this.ldnFlag = ldnFlag;
    }
    public BigDecimal getLdData() {
        return ldData;
    }

    public void setLdData(BigDecimal ldData) {
        this.ldData = ldData;
    }
    public String getLdFlag() {
        return ldFlag;
    }

    public void setLdFlag(String ldFlag) {
        this.ldFlag = ldFlag;
    }
    public BigDecimal getLnData() {
        return lnData;
    }

    public void setLnData(BigDecimal lnData) {
        this.lnData = lnData;
    }
    public String getLnFlag() {
        return lnFlag;
    }

    public void setLnFlag(String lnFlag) {
        this.lnFlag = lnFlag;
    }
    public BigDecimal getLmxData() {
        return lmxData;
    }

    public void setLmxData(BigDecimal lmxData) {
        this.lmxData = lmxData;
    }
    public String getLmxFlag() {
        return lmxFlag;
    }

    public void setLmxFlag(String lmxFlag) {
        this.lmxFlag = lmxFlag;
    }
    public BigDecimal getLmnData() {
        return lmnData;
    }

    public void setLmnData(BigDecimal lmnData) {
        this.lmnData = lmnData;
    }
    public String getLmnFlag() {
        return lmnFlag;
    }

    public void setLmnFlag(String lmnFlag) {
        this.lmnFlag = lmnFlag;
    }
    public BigDecimal getSdData() {
        return sdData;
    }

    public void setSdData(BigDecimal sdData) {
        this.sdData = sdData;
    }
    public String getSdFlag() {
        return sdFlag;
    }

    public void setSdFlag(String sdFlag) {
        this.sdFlag = sdFlag;
    }
    public BigDecimal getVdrData() {
        return vdrData;
    }

    public void setVdrData(BigDecimal vdrData) {
        this.vdrData = vdrData;
    }
    public String getVdrFlag() {
        return vdrFlag;
    }

    public void setVdrFlag(String vdrFlag) {
        this.vdrFlag = vdrFlag;
    }
    public BigDecimal geta01001Data() {
        return a01001Data;
    }

    public void seta01001Data(BigDecimal a01001Data) {
        this.a01001Data = a01001Data;
    }
    public String geta01001Flag() {
        return a01001Flag;
    }

    public void seta01001Flag(String a01001Flag) {
        this.a01001Flag = a01001Flag;
    }
    public BigDecimal geta01002Data() {
        return a01002Data;
    }

    public void seta01002Data(BigDecimal a01002Data) {
        this.a01002Data = a01002Data;
    }
    public String geta01002Flag() {
        return a01002Flag;
    }

    public void seta01002Flag(String a01002Flag) {
        this.a01002Flag = a01002Flag;
    }
    public BigDecimal geta01006Data() {
        return a01006Data;
    }

    public void seta01006Data(BigDecimal a01006Data) {
        this.a01006Data = a01006Data;
    }
    public String geta01006Flag() {
        return a01006Flag;
    }

    public void seta01006Flag(String a01006Flag) {
        this.a01006Flag = a01006Flag;
    }
    public BigDecimal geta01007Data() {
        return a01007Data;
    }

    public void seta01007Data(BigDecimal a01007Data) {
        this.a01007Data = a01007Data;
    }
    public String geta01007Flag() {
        return a01007Flag;
    }

    public void seta01007Flag(String a01007Flag) {
        this.a01007Flag = a01007Flag;
    }
    public BigDecimal geta01008Data() {
        return a01008Data;
    }

    public void seta01008Data(BigDecimal a01008Data) {
        this.a01008Data = a01008Data;
    }
    public String geta01008Flag() {
        return a01008Flag;
    }

    public void seta01008Flag(String a01008Flag) {
        this.a01008Flag = a01008Flag;
    }
    public BigDecimal geta06001Data() {
        return a06001Data;
    }

    public void seta06001Data(BigDecimal a06001Data) {
        this.a06001Data = a06001Data;
    }
    public String geta06001Flag() {
        return a06001Flag;
    }

    public void seta06001Flag(String a06001Flag) {
        this.a06001Flag = a06001Flag;
    }

    @Override
    public String toString() {
        return "NoiseHour{" +
            "stationCode=" + stationCode +
            ", deviceCode=" + deviceCode +
            ", timepoint=" + timepoint +
            ", laData=" + laData +
            ", laFlag=" + laFlag +
            ", l5Data=" + l5Data +
            ", l5Flag=" + l5Flag +
            ", l10Data=" + l10Data +
            ", l10Flag=" + l10Flag +
            ", l50Data=" + l50Data +
            ", l50Flag=" + l50Flag +
            ", l90Data=" + l90Data +
            ", l90Flag=" + l90Flag +
            ", l95Data=" + l95Data +
            ", l95Flag=" + l95Flag +
            ", leqData=" + leqData +
            ", leqFlag=" + leqFlag +
            ", ldnData=" + ldnData +
            ", ldnFlag=" + ldnFlag +
            ", ldData=" + ldData +
            ", ldFlag=" + ldFlag +
            ", lnData=" + lnData +
            ", lnFlag=" + lnFlag +
            ", lmxData=" + lmxData +
            ", lmxFlag=" + lmxFlag +
            ", lmnData=" + lmnData +
            ", lmnFlag=" + lmnFlag +
            ", sdData=" + sdData +
            ", sdFlag=" + sdFlag +
            ", vdrData=" + vdrData +
            ", vdrFlag=" + vdrFlag +
            ", a01001Data=" + a01001Data +
            ", a01001Flag=" + a01001Flag +
            ", a01002Data=" + a01002Data +
            ", a01002Flag=" + a01002Flag +
            ", a01006Data=" + a01006Data +
            ", a01006Flag=" + a01006Flag +
            ", a01007Data=" + a01007Data +
            ", a01007Flag=" + a01007Flag +
            ", a01008Data=" + a01008Data +
            ", a01008Flag=" + a01008Flag +
            ", a06001Data=" + a06001Data +
            ", a06001Flag=" + a06001Flag +
        "}";
    }
}
