package earth.tiangong.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 噪声报警数据表
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@TableName("public.t_noise_alarm")
public class NoiseAlarm implements Serializable {

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
     * 开始时间
     */
    private LocalDateTime startTimepoint;

    /**
     * 结束时间
     */
    private LocalDateTime endTimepoint;

    /**
     * 日志id
     */
    private String logId;

    /**
     * 瞬时声级数据
     */
    private BigDecimal laData;

    /**
     * 累计百分声级L5
     */
    private BigDecimal l5Data;

    /**
     * 累计百分声级L10
     */
    private BigDecimal l10Data;

    /**
     * 累计百分声级L50
     */
    private BigDecimal l50Data;

    /**
     * 累计百分声级L90
     */
    private BigDecimal l90Data;

    /**
     * 累计百分声级L95
     */
    private BigDecimal l95Data;

    /**
     * 等效声级
     */
    private BigDecimal leqData;

    /**
     * 昼夜等效声级
     */
    private BigDecimal ldnData;

    /**
     * 昼间等效声级
     */
    private BigDecimal ldData;

    /**
     * 夜间等效声级
     */
    private BigDecimal lnData;

    /**
     * 最大瞬时声级
     */
    private BigDecimal lmxData;

    /**
     * 最小瞬时声级
     */
    private BigDecimal lmnData;

    /**
     * 未知
     */
    private String eData;

    /**
     * 未知
     */
    private String leData;

    /**
     * 音频识别1
     */
    private String sound1Info;

    /**
     * 音频识别比重1
     */
    private String sound1Score;

    /**
     * 音频识别2
     */
    private String sound2Info;

    /**
     * 音频识别比重2
     */
    private String sound2Score;

    /**
     * 音频识别3
     */
    private String sound3Info;

    /**
     * 音频识别比重3
     */
    private String sound3Score;

    /**
     * 音频识别4
     */
    private String sound4Info;

    /**
     * 音频识别比重4
     */
    private String sound4Score;

    /**
     * 音频识别5
     */
    private String sound5Info;

    /**
     * 音频识别比重5
     */
    private String sound5Score;

    /**
     * 音频识别6
     */
    private String sound6Info;

    /**
     * 音频识别比重6
     */
    private String sound6Score;

    /**
     * 音频识别7
     */
    private String sound7Info;

    /**
     * 音频识别比重7
     */
    private String sound7Score;

    /**
     * 音频识别8
     */
    private String sound8Info;

    /**
     * 音频识别比重8
     */
    private String sound8Score;

    /**
     * 音频识别9
     */
    private String sound9Info;

    /**
     * 音频识别比重9
     */
    private String sound9Score;

    /**
     * 音频识别10
     */
    private String sound10Info;

    /**
     * 音频识别比重10
     */
    private String sound10Score;

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
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }
    public BigDecimal getLaData() {
        return laData;
    }

    public void setLaData(BigDecimal laData) {
        this.laData = laData;
    }
    public BigDecimal getl5Data() {
        return l5Data;
    }

    public void setl5Data(BigDecimal l5Data) {
        this.l5Data = l5Data;
    }
    public BigDecimal getl10Data() {
        return l10Data;
    }

    public void setl10Data(BigDecimal l10Data) {
        this.l10Data = l10Data;
    }
    public BigDecimal getl50Data() {
        return l50Data;
    }

    public void setl50Data(BigDecimal l50Data) {
        this.l50Data = l50Data;
    }
    public BigDecimal getl90Data() {
        return l90Data;
    }

    public void setl90Data(BigDecimal l90Data) {
        this.l90Data = l90Data;
    }
    public BigDecimal getl95Data() {
        return l95Data;
    }

    public void setl95Data(BigDecimal l95Data) {
        this.l95Data = l95Data;
    }
    public BigDecimal getLeqData() {
        return leqData;
    }

    public void setLeqData(BigDecimal leqData) {
        this.leqData = leqData;
    }
    public BigDecimal getLdnData() {
        return ldnData;
    }

    public void setLdnData(BigDecimal ldnData) {
        this.ldnData = ldnData;
    }
    public BigDecimal getLdData() {
        return ldData;
    }

    public void setLdData(BigDecimal ldData) {
        this.ldData = ldData;
    }
    public BigDecimal getLnData() {
        return lnData;
    }

    public void setLnData(BigDecimal lnData) {
        this.lnData = lnData;
    }
    public BigDecimal getLmxData() {
        return lmxData;
    }

    public void setLmxData(BigDecimal lmxData) {
        this.lmxData = lmxData;
    }
    public BigDecimal getLmnData() {
        return lmnData;
    }

    public void setLmnData(BigDecimal lmnData) {
        this.lmnData = lmnData;
    }
    public String geteData() {
        return eData;
    }

    public void seteData(String eData) {
        this.eData = eData;
    }
    public String getLeData() {
        return leData;
    }

    public void setLeData(String leData) {
        this.leData = leData;
    }
    public String getSound1Info() {
        return sound1Info;
    }

    public void setSound1Info(String sound1Info) {
        this.sound1Info = sound1Info;
    }
    public String getSound1Score() {
        return sound1Score;
    }

    public void setSound1Score(String sound1Score) {
        this.sound1Score = sound1Score;
    }
    public String getSound2Info() {
        return sound2Info;
    }

    public void setSound2Info(String sound2Info) {
        this.sound2Info = sound2Info;
    }
    public String getSound2Score() {
        return sound2Score;
    }

    public void setSound2Score(String sound2Score) {
        this.sound2Score = sound2Score;
    }
    public String getSound3Info() {
        return sound3Info;
    }

    public void setSound3Info(String sound3Info) {
        this.sound3Info = sound3Info;
    }
    public String getSound3Score() {
        return sound3Score;
    }

    public void setSound3Score(String sound3Score) {
        this.sound3Score = sound3Score;
    }
    public String getSound4Info() {
        return sound4Info;
    }

    public void setSound4Info(String sound4Info) {
        this.sound4Info = sound4Info;
    }
    public String getSound4Score() {
        return sound4Score;
    }

    public void setSound4Score(String sound4Score) {
        this.sound4Score = sound4Score;
    }
    public String getSound5Info() {
        return sound5Info;
    }

    public void setSound5Info(String sound5Info) {
        this.sound5Info = sound5Info;
    }
    public String getSound5Score() {
        return sound5Score;
    }

    public void setSound5Score(String sound5Score) {
        this.sound5Score = sound5Score;
    }
    public String getSound6Info() {
        return sound6Info;
    }

    public void setSound6Info(String sound6Info) {
        this.sound6Info = sound6Info;
    }
    public String getSound6Score() {
        return sound6Score;
    }

    public void setSound6Score(String sound6Score) {
        this.sound6Score = sound6Score;
    }
    public String getSound7Info() {
        return sound7Info;
    }

    public void setSound7Info(String sound7Info) {
        this.sound7Info = sound7Info;
    }
    public String getSound7Score() {
        return sound7Score;
    }

    public void setSound7Score(String sound7Score) {
        this.sound7Score = sound7Score;
    }
    public String getSound8Info() {
        return sound8Info;
    }

    public void setSound8Info(String sound8Info) {
        this.sound8Info = sound8Info;
    }
    public String getSound8Score() {
        return sound8Score;
    }

    public void setSound8Score(String sound8Score) {
        this.sound8Score = sound8Score;
    }
    public String getSound9Info() {
        return sound9Info;
    }

    public void setSound9Info(String sound9Info) {
        this.sound9Info = sound9Info;
    }
    public String getSound9Score() {
        return sound9Score;
    }

    public void setSound9Score(String sound9Score) {
        this.sound9Score = sound9Score;
    }
    public String getSound10Info() {
        return sound10Info;
    }

    public void setSound10Info(String sound10Info) {
        this.sound10Info = sound10Info;
    }
    public String getSound10Score() {
        return sound10Score;
    }

    public void setSound10Score(String sound10Score) {
        this.sound10Score = sound10Score;
    }

    @Override
    public String toString() {
        return "NoiseAlarm{" +
            "stationCode=" + stationCode +
            ", deviceCode=" + deviceCode +
            ", startTimepoint=" + startTimepoint +
            ", endTimepoint=" + endTimepoint +
            ", logId=" + logId +
            ", laData=" + laData +
            ", l5Data=" + l5Data +
            ", l10Data=" + l10Data +
            ", l50Data=" + l50Data +
            ", l90Data=" + l90Data +
            ", l95Data=" + l95Data +
            ", leqData=" + leqData +
            ", ldnData=" + ldnData +
            ", ldData=" + ldData +
            ", lnData=" + lnData +
            ", lmxData=" + lmxData +
            ", lmnData=" + lmnData +
            ", eData=" + eData +
            ", leData=" + leData +
            ", sound1Info=" + sound1Info +
            ", sound1Score=" + sound1Score +
            ", sound2Info=" + sound2Info +
            ", sound2Score=" + sound2Score +
            ", sound3Info=" + sound3Info +
            ", sound3Score=" + sound3Score +
            ", sound4Info=" + sound4Info +
            ", sound4Score=" + sound4Score +
            ", sound5Info=" + sound5Info +
            ", sound5Score=" + sound5Score +
            ", sound6Info=" + sound6Info +
            ", sound6Score=" + sound6Score +
            ", sound7Info=" + sound7Info +
            ", sound7Score=" + sound7Score +
            ", sound8Info=" + sound8Info +
            ", sound8Score=" + sound8Score +
            ", sound9Info=" + sound9Info +
            ", sound9Score=" + sound9Score +
            ", sound10Info=" + sound10Info +
            ", sound10Score=" + sound10Score +
        "}";
    }
}
