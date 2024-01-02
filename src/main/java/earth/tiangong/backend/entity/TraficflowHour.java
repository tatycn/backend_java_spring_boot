package earth.tiangong.backend.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 车流量小时数据表
 * </p>
 *
 * @author TianGong
 * @since 2024-01-02
 */
@TableName("public.t_traficflow_hour")
public class TraficflowHour implements Serializable {

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
     * 总流量
     */
    private BigDecimal c00001Data;

    /**
     * 总流量-标记
     */
    private String c00001Flag;

    /**
     * 小型车流量
     */
    private BigDecimal c00002Data;

    /**
     * 小型车流量-标记
     */
    private String c00002Flag;

    /**
     * 中型车流量
     */
    private BigDecimal c00003Data;

    /**
     * 中型车流量-标记
     */
    private String c00003Flag;

    /**
     * 大型车流量
     */
    private BigDecimal c00004Data;

    /**
     * 大型车流量-标记
     */
    private String c00004Flag;

    /**
     * 特大型车流量
     */
    private BigDecimal c00005Data;

    /**
     * 特大型车流量-标记
     */
    private String c00005Flag;

    /**
     * 占有率
     */
    private BigDecimal c00006Data;

    /**
     * 占有率-标记
     */
    private String c00006Flag;

    /**
     * 平均车速
     */
    private BigDecimal c00007Data;

    /**
     * 平均车速-标记
     */
    private String c00007Flag;

    /**
     * 总流量_1车道
     */
    private BigDecimal c00101Data;

    /**
     * 总流量_1车道-标记
     */
    private String c00101Flag;

    /**
     * 小型车流量_1车道
     */
    private BigDecimal c00102Data;

    /**
     * 小型车流量_1车道-标记
     */
    private String c00102Flag;

    /**
     * 中型车流量_1车道
     */
    private BigDecimal c00103Data;

    /**
     * 中型车流量_1车道-标记
     */
    private String c00103Flag;

    /**
     * 大型车流量_1车道
     */
    private BigDecimal c00104Data;

    /**
     * 大型车流量_1车道-标记
     */
    private String c00104Flag;

    /**
     * 特大型车流量_1车道
     */
    private BigDecimal c00105Data;

    /**
     * 特大型车流量_1车道-标记
     */
    private String c00105Flag;

    /**
     * 占有率_1车道
     */
    private BigDecimal c00106Data;

    /**
     * 占有率_1车道-标记
     */
    private String c00106Flag;

    /**
     * 平均车速_1车道
     */
    private BigDecimal c00107Data;

    /**
     * 平均车速_1车道-标记
     */
    private String c00107Flag;

    /**
     * 总流量_2车道
     */
    private BigDecimal c00201Data;

    /**
     * 总流量_2车道-标记
     */
    private String c00201Flag;

    /**
     * 小型车流量_2车道
     */
    private BigDecimal c00202Data;

    /**
     * 小型车流量_2车道-标记
     */
    private String c00202Flag;

    /**
     * 中型车流量_2车道
     */
    private BigDecimal c00203Data;

    /**
     * 中型车流量_2车道-标记
     */
    private String c00203Flag;

    /**
     * 大型车流量_2车道
     */
    private BigDecimal c00204Data;

    /**
     * 大型车流量_2车道-标记
     */
    private String c00204Flag;

    /**
     * 特大型车流量_2车道
     */
    private BigDecimal c00205Data;

    /**
     * 特大型车流量_2车道-标记
     */
    private String c00205Flag;

    /**
     * 占有率_2车道
     */
    private BigDecimal c00206Data;

    /**
     * 占有率_2车道-标记
     */
    private String c00206Flag;

    /**
     * 平均车速_2车道
     */
    private BigDecimal c00207Data;

    /**
     * 平均车速_2车道-标记
     */
    private String c00207Flag;

    /**
     * 总流量_3车道
     */
    private BigDecimal c00301Data;

    /**
     * 总流量_3车道-标记
     */
    private String c00301Flag;

    /**
     * 小型车流量_3车道
     */
    private BigDecimal c00302Data;

    /**
     * 小型车流量_3车道-标记
     */
    private String c00302Flag;

    /**
     * 中型车流量_3车道
     */
    private BigDecimal c00303Data;

    /**
     * 中型车流量_3车道-标记
     */
    private String c00303Flag;

    /**
     * 大型车流量_3车道
     */
    private BigDecimal c00304Data;

    /**
     * 大型车流量_3车道-标记
     */
    private String c00304Flag;

    /**
     * 特大型车流量_3车道
     */
    private BigDecimal c00305Data;

    /**
     * 特大型车流量_3车道-标记
     */
    private String c00305Flag;

    /**
     * 占有率_3车道
     */
    private BigDecimal c00306Data;

    /**
     * 占有率_3车道-标记
     */
    private String c00306Flag;

    /**
     * 平均车速_3车道
     */
    private BigDecimal c00307Data;

    /**
     * 平均车速_3车道-标记
     */
    private String c00307Flag;

    /**
     * 总流量_4车道
     */
    private BigDecimal c00401Data;

    /**
     * 总流量_4车道-标记
     */
    private String c00401Flag;

    /**
     * 小型车流量_4车道
     */
    private BigDecimal c00402Data;

    /**
     * 小型车流量_4车道-标记
     */
    private String c00402Flag;

    /**
     * 中型车流量_4车道
     */
    private BigDecimal c00403Data;

    /**
     * 中型车流量_4车道-标记
     */
    private String c00403Flag;

    /**
     * 大型车流量_4车道
     */
    private BigDecimal c00404Data;

    /**
     * 大型车流量_4车道-标记
     */
    private String c00404Flag;

    /**
     * 特大型车流量_4车道
     */
    private BigDecimal c00405Data;

    /**
     * 特大型车流量_4车道-标记
     */
    private String c00405Flag;

    /**
     * 占有率_4车道
     */
    private BigDecimal c00406Data;

    /**
     * 占有率_4车道-标记
     */
    private String c00406Flag;

    /**
     * 平均车速_4车道
     */
    private BigDecimal c00407Data;

    /**
     * 平均车速_4车道-标记
     */
    private String c00407Flag;

    /**
     * 总流量_5车道
     */
    private BigDecimal c00501Data;

    /**
     * 总流量_5车道-标记
     */
    private String c00501Flag;

    /**
     * 小型车流量_5车道
     */
    private BigDecimal c00502Data;

    /**
     * 小型车流量_5车道-标记
     */
    private String c00502Flag;

    /**
     * 中型车流量_5车道
     */
    private BigDecimal c00503Data;

    /**
     * 中型车流量_5车道-标记
     */
    private String c00503Flag;

    /**
     * 大型车流量_5车道
     */
    private BigDecimal c00504Data;

    /**
     * 大型车流量_5车道-标记
     */
    private String c00504Flag;

    /**
     * 特大型车流量_5车道
     */
    private BigDecimal c00505Data;

    /**
     * 特大型车流量_5车道-标记
     */
    private String c00505Flag;

    /**
     * 占有率_5车道
     */
    private BigDecimal c00506Data;

    /**
     * 占有率_5车道-标记
     */
    private String c00506Flag;

    /**
     * 平均车速_5车道
     */
    private BigDecimal c00507Data;

    /**
     * 平均车速_5车道-标记
     */
    private String c00507Flag;

    /**
     * 总流量_6车道
     */
    private BigDecimal c00601Data;

    /**
     * 总流量_6车道-标记
     */
    private String c00601Flag;

    /**
     * 小型车流量_6车道
     */
    private BigDecimal c00602Data;

    /**
     * 小型车流量_6车道-标记
     */
    private String c00602Flag;

    /**
     * 中型车流量_6车道
     */
    private BigDecimal c00603Data;

    /**
     * 中型车流量_6车道-标记
     */
    private String c00603Flag;

    /**
     * 大型车流量_6车道
     */
    private BigDecimal c00604Data;

    /**
     * 大型车流量_6车道-标记
     */
    private String c00604Flag;

    /**
     * 特大型车流量_6车道
     */
    private BigDecimal c00605Data;

    /**
     * 特大型车流量_6车道-标记
     */
    private String c00605Flag;

    /**
     * 占有率_6车道
     */
    private BigDecimal c00606Data;

    /**
     * 占有率_6车道-标记
     */
    private String c00606Flag;

    /**
     * 平均车速_6车道
     */
    private BigDecimal c00607Data;

    /**
     * 平均车速_6车道-标记
     */
    private String c00607Flag;

    /**
     * 总流量_7车道
     */
    private BigDecimal c00701Data;

    /**
     * 总流量_7车道-标记
     */
    private String c00701Flag;

    /**
     * 小型车流量_7车道
     */
    private BigDecimal c00702Data;

    /**
     * 小型车流量_7车道-标记
     */
    private String c00702Flag;

    /**
     * 中型车流量_7车道
     */
    private BigDecimal c00703Data;

    /**
     * 中型车流量_7车道-标记
     */
    private String c00703Flag;

    /**
     * 大型车流量_7车道
     */
    private BigDecimal c00704Data;

    /**
     * 大型车流量_7车道-标记
     */
    private String c00704Flag;

    /**
     * 特大型车流量_7车道
     */
    private BigDecimal c00705Data;

    /**
     * 特大型车流量_7车道-标记
     */
    private String c00705Flag;

    /**
     * 占有率_7车道
     */
    private BigDecimal c00706Data;

    /**
     * 占有率_7车道-标记
     */
    private String c00706Flag;

    /**
     * 平均车速_7车道
     */
    private BigDecimal c00707Data;

    /**
     * 平均车速_7车道-标记
     */
    private String c00707Flag;

    /**
     * 总流量_8车道
     */
    private BigDecimal c00801Data;

    /**
     * 总流量_8车道-标记
     */
    private String c00801Flag;

    /**
     * 小型车流量_8车道
     */
    private BigDecimal c00802Data;

    /**
     * 小型车流量_8车道-标记
     */
    private String c00802Flag;

    /**
     * 中型车流量_8车道
     */
    private BigDecimal c00803Data;

    /**
     * 中型车流量_8车道-标记
     */
    private String c00803Flag;

    /**
     * 大型车流量_8车道
     */
    private BigDecimal c00804Data;

    /**
     * 大型车流量_8车道-标记
     */
    private String c00804Flag;

    /**
     * 特大型车流量_8车道
     */
    private BigDecimal c00805Data;

    /**
     * 特大型车流量_8车道-标记
     */
    private String c00805Flag;

    /**
     * 占有率_8车道
     */
    private BigDecimal c00806Data;

    /**
     * 占有率_8车道-标记
     */
    private String c00806Flag;

    /**
     * 平均车速_8车道
     */
    private BigDecimal c00807Data;

    /**
     * 平均车速_8车道-标记
     */
    private String c00807Flag;

    /**
     * 总流量_9车道
     */
    private BigDecimal c00901Data;

    /**
     * 总流量_9车道-标记
     */
    private String c00901Flag;

    /**
     * 小型车流量_9车道
     */
    private BigDecimal c00902Data;

    /**
     * 小型车流量_9车道-标记
     */
    private String c00902Flag;

    /**
     * 中型车流量_9车道
     */
    private BigDecimal c00903Data;

    /**
     * 中型车流量_9车道-标记
     */
    private String c00903Flag;

    /**
     * 大型车流量_9车道
     */
    private BigDecimal c00904Data;

    /**
     * 大型车流量_9车道-标记
     */
    private String c00904Flag;

    /**
     * 特大型车流量_9车道
     */
    private BigDecimal c00905Data;

    /**
     * 特大型车流量_9车道-标记
     */
    private String c00905Flag;

    /**
     * 占有率_9车道
     */
    private BigDecimal c00906Data;

    /**
     * 占有率_9车道-标记
     */
    private String c00906Flag;

    /**
     * 平均车速_9车道
     */
    private BigDecimal c00907Data;

    /**
     * 平均车速_9车道-标记
     */
    private String c00907Flag;

    /**
     * 总流量_10车道
     */
    private BigDecimal c01001Data;

    /**
     * 总流量_10车道-标记
     */
    private String c01001Flag;

    /**
     * 小型车流量_10车道
     */
    private BigDecimal c01002Data;

    /**
     * 小型车流量_10车道-标记
     */
    private String c01002Flag;

    /**
     * 中型车流量_10车道
     */
    private BigDecimal c01003Data;

    /**
     * 中型车流量_10车道-标记
     */
    private String c01003Flag;

    /**
     * 大型车流量_10车道
     */
    private BigDecimal c01004Data;

    /**
     * 大型车流量_10车道-标记
     */
    private String c01004Flag;

    /**
     * 特大型车流量_10车道
     */
    private BigDecimal c01005Data;

    /**
     * 特大型车流量_10车道-标记
     */
    private String c01005Flag;

    /**
     * 占有率_10车道
     */
    private BigDecimal c01006Data;

    /**
     * 占有率_10车道-标记
     */
    private String c01006Flag;

    /**
     * 平均车速_10车道
     */
    private BigDecimal c01007Data;

    /**
     * 平均车速_10车道-标记
     */
    private String c01007Flag;

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
    public BigDecimal getc00001Data() {
        return c00001Data;
    }

    public void setc00001Data(BigDecimal c00001Data) {
        this.c00001Data = c00001Data;
    }
    public String getc00001Flag() {
        return c00001Flag;
    }

    public void setc00001Flag(String c00001Flag) {
        this.c00001Flag = c00001Flag;
    }
    public BigDecimal getc00002Data() {
        return c00002Data;
    }

    public void setc00002Data(BigDecimal c00002Data) {
        this.c00002Data = c00002Data;
    }
    public String getc00002Flag() {
        return c00002Flag;
    }

    public void setc00002Flag(String c00002Flag) {
        this.c00002Flag = c00002Flag;
    }
    public BigDecimal getc00003Data() {
        return c00003Data;
    }

    public void setc00003Data(BigDecimal c00003Data) {
        this.c00003Data = c00003Data;
    }
    public String getc00003Flag() {
        return c00003Flag;
    }

    public void setc00003Flag(String c00003Flag) {
        this.c00003Flag = c00003Flag;
    }
    public BigDecimal getc00004Data() {
        return c00004Data;
    }

    public void setc00004Data(BigDecimal c00004Data) {
        this.c00004Data = c00004Data;
    }
    public String getc00004Flag() {
        return c00004Flag;
    }

    public void setc00004Flag(String c00004Flag) {
        this.c00004Flag = c00004Flag;
    }
    public BigDecimal getc00005Data() {
        return c00005Data;
    }

    public void setc00005Data(BigDecimal c00005Data) {
        this.c00005Data = c00005Data;
    }
    public String getc00005Flag() {
        return c00005Flag;
    }

    public void setc00005Flag(String c00005Flag) {
        this.c00005Flag = c00005Flag;
    }
    public BigDecimal getc00006Data() {
        return c00006Data;
    }

    public void setc00006Data(BigDecimal c00006Data) {
        this.c00006Data = c00006Data;
    }
    public String getc00006Flag() {
        return c00006Flag;
    }

    public void setc00006Flag(String c00006Flag) {
        this.c00006Flag = c00006Flag;
    }
    public BigDecimal getc00007Data() {
        return c00007Data;
    }

    public void setc00007Data(BigDecimal c00007Data) {
        this.c00007Data = c00007Data;
    }
    public String getc00007Flag() {
        return c00007Flag;
    }

    public void setc00007Flag(String c00007Flag) {
        this.c00007Flag = c00007Flag;
    }
    public BigDecimal getc00101Data() {
        return c00101Data;
    }

    public void setc00101Data(BigDecimal c00101Data) {
        this.c00101Data = c00101Data;
    }
    public String getc00101Flag() {
        return c00101Flag;
    }

    public void setc00101Flag(String c00101Flag) {
        this.c00101Flag = c00101Flag;
    }
    public BigDecimal getc00102Data() {
        return c00102Data;
    }

    public void setc00102Data(BigDecimal c00102Data) {
        this.c00102Data = c00102Data;
    }
    public String getc00102Flag() {
        return c00102Flag;
    }

    public void setc00102Flag(String c00102Flag) {
        this.c00102Flag = c00102Flag;
    }
    public BigDecimal getc00103Data() {
        return c00103Data;
    }

    public void setc00103Data(BigDecimal c00103Data) {
        this.c00103Data = c00103Data;
    }
    public String getc00103Flag() {
        return c00103Flag;
    }

    public void setc00103Flag(String c00103Flag) {
        this.c00103Flag = c00103Flag;
    }
    public BigDecimal getc00104Data() {
        return c00104Data;
    }

    public void setc00104Data(BigDecimal c00104Data) {
        this.c00104Data = c00104Data;
    }
    public String getc00104Flag() {
        return c00104Flag;
    }

    public void setc00104Flag(String c00104Flag) {
        this.c00104Flag = c00104Flag;
    }
    public BigDecimal getc00105Data() {
        return c00105Data;
    }

    public void setc00105Data(BigDecimal c00105Data) {
        this.c00105Data = c00105Data;
    }
    public String getc00105Flag() {
        return c00105Flag;
    }

    public void setc00105Flag(String c00105Flag) {
        this.c00105Flag = c00105Flag;
    }
    public BigDecimal getc00106Data() {
        return c00106Data;
    }

    public void setc00106Data(BigDecimal c00106Data) {
        this.c00106Data = c00106Data;
    }
    public String getc00106Flag() {
        return c00106Flag;
    }

    public void setc00106Flag(String c00106Flag) {
        this.c00106Flag = c00106Flag;
    }
    public BigDecimal getc00107Data() {
        return c00107Data;
    }

    public void setc00107Data(BigDecimal c00107Data) {
        this.c00107Data = c00107Data;
    }
    public String getc00107Flag() {
        return c00107Flag;
    }

    public void setc00107Flag(String c00107Flag) {
        this.c00107Flag = c00107Flag;
    }
    public BigDecimal getc00201Data() {
        return c00201Data;
    }

    public void setc00201Data(BigDecimal c00201Data) {
        this.c00201Data = c00201Data;
    }
    public String getc00201Flag() {
        return c00201Flag;
    }

    public void setc00201Flag(String c00201Flag) {
        this.c00201Flag = c00201Flag;
    }
    public BigDecimal getc00202Data() {
        return c00202Data;
    }

    public void setc00202Data(BigDecimal c00202Data) {
        this.c00202Data = c00202Data;
    }
    public String getc00202Flag() {
        return c00202Flag;
    }

    public void setc00202Flag(String c00202Flag) {
        this.c00202Flag = c00202Flag;
    }
    public BigDecimal getc00203Data() {
        return c00203Data;
    }

    public void setc00203Data(BigDecimal c00203Data) {
        this.c00203Data = c00203Data;
    }
    public String getc00203Flag() {
        return c00203Flag;
    }

    public void setc00203Flag(String c00203Flag) {
        this.c00203Flag = c00203Flag;
    }
    public BigDecimal getc00204Data() {
        return c00204Data;
    }

    public void setc00204Data(BigDecimal c00204Data) {
        this.c00204Data = c00204Data;
    }
    public String getc00204Flag() {
        return c00204Flag;
    }

    public void setc00204Flag(String c00204Flag) {
        this.c00204Flag = c00204Flag;
    }
    public BigDecimal getc00205Data() {
        return c00205Data;
    }

    public void setc00205Data(BigDecimal c00205Data) {
        this.c00205Data = c00205Data;
    }
    public String getc00205Flag() {
        return c00205Flag;
    }

    public void setc00205Flag(String c00205Flag) {
        this.c00205Flag = c00205Flag;
    }
    public BigDecimal getc00206Data() {
        return c00206Data;
    }

    public void setc00206Data(BigDecimal c00206Data) {
        this.c00206Data = c00206Data;
    }
    public String getc00206Flag() {
        return c00206Flag;
    }

    public void setc00206Flag(String c00206Flag) {
        this.c00206Flag = c00206Flag;
    }
    public BigDecimal getc00207Data() {
        return c00207Data;
    }

    public void setc00207Data(BigDecimal c00207Data) {
        this.c00207Data = c00207Data;
    }
    public String getc00207Flag() {
        return c00207Flag;
    }

    public void setc00207Flag(String c00207Flag) {
        this.c00207Flag = c00207Flag;
    }
    public BigDecimal getc00301Data() {
        return c00301Data;
    }

    public void setc00301Data(BigDecimal c00301Data) {
        this.c00301Data = c00301Data;
    }
    public String getc00301Flag() {
        return c00301Flag;
    }

    public void setc00301Flag(String c00301Flag) {
        this.c00301Flag = c00301Flag;
    }
    public BigDecimal getc00302Data() {
        return c00302Data;
    }

    public void setc00302Data(BigDecimal c00302Data) {
        this.c00302Data = c00302Data;
    }
    public String getc00302Flag() {
        return c00302Flag;
    }

    public void setc00302Flag(String c00302Flag) {
        this.c00302Flag = c00302Flag;
    }
    public BigDecimal getc00303Data() {
        return c00303Data;
    }

    public void setc00303Data(BigDecimal c00303Data) {
        this.c00303Data = c00303Data;
    }
    public String getc00303Flag() {
        return c00303Flag;
    }

    public void setc00303Flag(String c00303Flag) {
        this.c00303Flag = c00303Flag;
    }
    public BigDecimal getc00304Data() {
        return c00304Data;
    }

    public void setc00304Data(BigDecimal c00304Data) {
        this.c00304Data = c00304Data;
    }
    public String getc00304Flag() {
        return c00304Flag;
    }

    public void setc00304Flag(String c00304Flag) {
        this.c00304Flag = c00304Flag;
    }
    public BigDecimal getc00305Data() {
        return c00305Data;
    }

    public void setc00305Data(BigDecimal c00305Data) {
        this.c00305Data = c00305Data;
    }
    public String getc00305Flag() {
        return c00305Flag;
    }

    public void setc00305Flag(String c00305Flag) {
        this.c00305Flag = c00305Flag;
    }
    public BigDecimal getc00306Data() {
        return c00306Data;
    }

    public void setc00306Data(BigDecimal c00306Data) {
        this.c00306Data = c00306Data;
    }
    public String getc00306Flag() {
        return c00306Flag;
    }

    public void setc00306Flag(String c00306Flag) {
        this.c00306Flag = c00306Flag;
    }
    public BigDecimal getc00307Data() {
        return c00307Data;
    }

    public void setc00307Data(BigDecimal c00307Data) {
        this.c00307Data = c00307Data;
    }
    public String getc00307Flag() {
        return c00307Flag;
    }

    public void setc00307Flag(String c00307Flag) {
        this.c00307Flag = c00307Flag;
    }
    public BigDecimal getc00401Data() {
        return c00401Data;
    }

    public void setc00401Data(BigDecimal c00401Data) {
        this.c00401Data = c00401Data;
    }
    public String getc00401Flag() {
        return c00401Flag;
    }

    public void setc00401Flag(String c00401Flag) {
        this.c00401Flag = c00401Flag;
    }
    public BigDecimal getc00402Data() {
        return c00402Data;
    }

    public void setc00402Data(BigDecimal c00402Data) {
        this.c00402Data = c00402Data;
    }
    public String getc00402Flag() {
        return c00402Flag;
    }

    public void setc00402Flag(String c00402Flag) {
        this.c00402Flag = c00402Flag;
    }
    public BigDecimal getc00403Data() {
        return c00403Data;
    }

    public void setc00403Data(BigDecimal c00403Data) {
        this.c00403Data = c00403Data;
    }
    public String getc00403Flag() {
        return c00403Flag;
    }

    public void setc00403Flag(String c00403Flag) {
        this.c00403Flag = c00403Flag;
    }
    public BigDecimal getc00404Data() {
        return c00404Data;
    }

    public void setc00404Data(BigDecimal c00404Data) {
        this.c00404Data = c00404Data;
    }
    public String getc00404Flag() {
        return c00404Flag;
    }

    public void setc00404Flag(String c00404Flag) {
        this.c00404Flag = c00404Flag;
    }
    public BigDecimal getc00405Data() {
        return c00405Data;
    }

    public void setc00405Data(BigDecimal c00405Data) {
        this.c00405Data = c00405Data;
    }
    public String getc00405Flag() {
        return c00405Flag;
    }

    public void setc00405Flag(String c00405Flag) {
        this.c00405Flag = c00405Flag;
    }
    public BigDecimal getc00406Data() {
        return c00406Data;
    }

    public void setc00406Data(BigDecimal c00406Data) {
        this.c00406Data = c00406Data;
    }
    public String getc00406Flag() {
        return c00406Flag;
    }

    public void setc00406Flag(String c00406Flag) {
        this.c00406Flag = c00406Flag;
    }
    public BigDecimal getc00407Data() {
        return c00407Data;
    }

    public void setc00407Data(BigDecimal c00407Data) {
        this.c00407Data = c00407Data;
    }
    public String getc00407Flag() {
        return c00407Flag;
    }

    public void setc00407Flag(String c00407Flag) {
        this.c00407Flag = c00407Flag;
    }
    public BigDecimal getc00501Data() {
        return c00501Data;
    }

    public void setc00501Data(BigDecimal c00501Data) {
        this.c00501Data = c00501Data;
    }
    public String getc00501Flag() {
        return c00501Flag;
    }

    public void setc00501Flag(String c00501Flag) {
        this.c00501Flag = c00501Flag;
    }
    public BigDecimal getc00502Data() {
        return c00502Data;
    }

    public void setc00502Data(BigDecimal c00502Data) {
        this.c00502Data = c00502Data;
    }
    public String getc00502Flag() {
        return c00502Flag;
    }

    public void setc00502Flag(String c00502Flag) {
        this.c00502Flag = c00502Flag;
    }
    public BigDecimal getc00503Data() {
        return c00503Data;
    }

    public void setc00503Data(BigDecimal c00503Data) {
        this.c00503Data = c00503Data;
    }
    public String getc00503Flag() {
        return c00503Flag;
    }

    public void setc00503Flag(String c00503Flag) {
        this.c00503Flag = c00503Flag;
    }
    public BigDecimal getc00504Data() {
        return c00504Data;
    }

    public void setc00504Data(BigDecimal c00504Data) {
        this.c00504Data = c00504Data;
    }
    public String getc00504Flag() {
        return c00504Flag;
    }

    public void setc00504Flag(String c00504Flag) {
        this.c00504Flag = c00504Flag;
    }
    public BigDecimal getc00505Data() {
        return c00505Data;
    }

    public void setc00505Data(BigDecimal c00505Data) {
        this.c00505Data = c00505Data;
    }
    public String getc00505Flag() {
        return c00505Flag;
    }

    public void setc00505Flag(String c00505Flag) {
        this.c00505Flag = c00505Flag;
    }
    public BigDecimal getc00506Data() {
        return c00506Data;
    }

    public void setc00506Data(BigDecimal c00506Data) {
        this.c00506Data = c00506Data;
    }
    public String getc00506Flag() {
        return c00506Flag;
    }

    public void setc00506Flag(String c00506Flag) {
        this.c00506Flag = c00506Flag;
    }
    public BigDecimal getc00507Data() {
        return c00507Data;
    }

    public void setc00507Data(BigDecimal c00507Data) {
        this.c00507Data = c00507Data;
    }
    public String getc00507Flag() {
        return c00507Flag;
    }

    public void setc00507Flag(String c00507Flag) {
        this.c00507Flag = c00507Flag;
    }
    public BigDecimal getc00601Data() {
        return c00601Data;
    }

    public void setc00601Data(BigDecimal c00601Data) {
        this.c00601Data = c00601Data;
    }
    public String getc00601Flag() {
        return c00601Flag;
    }

    public void setc00601Flag(String c00601Flag) {
        this.c00601Flag = c00601Flag;
    }
    public BigDecimal getc00602Data() {
        return c00602Data;
    }

    public void setc00602Data(BigDecimal c00602Data) {
        this.c00602Data = c00602Data;
    }
    public String getc00602Flag() {
        return c00602Flag;
    }

    public void setc00602Flag(String c00602Flag) {
        this.c00602Flag = c00602Flag;
    }
    public BigDecimal getc00603Data() {
        return c00603Data;
    }

    public void setc00603Data(BigDecimal c00603Data) {
        this.c00603Data = c00603Data;
    }
    public String getc00603Flag() {
        return c00603Flag;
    }

    public void setc00603Flag(String c00603Flag) {
        this.c00603Flag = c00603Flag;
    }
    public BigDecimal getc00604Data() {
        return c00604Data;
    }

    public void setc00604Data(BigDecimal c00604Data) {
        this.c00604Data = c00604Data;
    }
    public String getc00604Flag() {
        return c00604Flag;
    }

    public void setc00604Flag(String c00604Flag) {
        this.c00604Flag = c00604Flag;
    }
    public BigDecimal getc00605Data() {
        return c00605Data;
    }

    public void setc00605Data(BigDecimal c00605Data) {
        this.c00605Data = c00605Data;
    }
    public String getc00605Flag() {
        return c00605Flag;
    }

    public void setc00605Flag(String c00605Flag) {
        this.c00605Flag = c00605Flag;
    }
    public BigDecimal getc00606Data() {
        return c00606Data;
    }

    public void setc00606Data(BigDecimal c00606Data) {
        this.c00606Data = c00606Data;
    }
    public String getc00606Flag() {
        return c00606Flag;
    }

    public void setc00606Flag(String c00606Flag) {
        this.c00606Flag = c00606Flag;
    }
    public BigDecimal getc00607Data() {
        return c00607Data;
    }

    public void setc00607Data(BigDecimal c00607Data) {
        this.c00607Data = c00607Data;
    }
    public String getc00607Flag() {
        return c00607Flag;
    }

    public void setc00607Flag(String c00607Flag) {
        this.c00607Flag = c00607Flag;
    }
    public BigDecimal getc00701Data() {
        return c00701Data;
    }

    public void setc00701Data(BigDecimal c00701Data) {
        this.c00701Data = c00701Data;
    }
    public String getc00701Flag() {
        return c00701Flag;
    }

    public void setc00701Flag(String c00701Flag) {
        this.c00701Flag = c00701Flag;
    }
    public BigDecimal getc00702Data() {
        return c00702Data;
    }

    public void setc00702Data(BigDecimal c00702Data) {
        this.c00702Data = c00702Data;
    }
    public String getc00702Flag() {
        return c00702Flag;
    }

    public void setc00702Flag(String c00702Flag) {
        this.c00702Flag = c00702Flag;
    }
    public BigDecimal getc00703Data() {
        return c00703Data;
    }

    public void setc00703Data(BigDecimal c00703Data) {
        this.c00703Data = c00703Data;
    }
    public String getc00703Flag() {
        return c00703Flag;
    }

    public void setc00703Flag(String c00703Flag) {
        this.c00703Flag = c00703Flag;
    }
    public BigDecimal getc00704Data() {
        return c00704Data;
    }

    public void setc00704Data(BigDecimal c00704Data) {
        this.c00704Data = c00704Data;
    }
    public String getc00704Flag() {
        return c00704Flag;
    }

    public void setc00704Flag(String c00704Flag) {
        this.c00704Flag = c00704Flag;
    }
    public BigDecimal getc00705Data() {
        return c00705Data;
    }

    public void setc00705Data(BigDecimal c00705Data) {
        this.c00705Data = c00705Data;
    }
    public String getc00705Flag() {
        return c00705Flag;
    }

    public void setc00705Flag(String c00705Flag) {
        this.c00705Flag = c00705Flag;
    }
    public BigDecimal getc00706Data() {
        return c00706Data;
    }

    public void setc00706Data(BigDecimal c00706Data) {
        this.c00706Data = c00706Data;
    }
    public String getc00706Flag() {
        return c00706Flag;
    }

    public void setc00706Flag(String c00706Flag) {
        this.c00706Flag = c00706Flag;
    }
    public BigDecimal getc00707Data() {
        return c00707Data;
    }

    public void setc00707Data(BigDecimal c00707Data) {
        this.c00707Data = c00707Data;
    }
    public String getc00707Flag() {
        return c00707Flag;
    }

    public void setc00707Flag(String c00707Flag) {
        this.c00707Flag = c00707Flag;
    }
    public BigDecimal getc00801Data() {
        return c00801Data;
    }

    public void setc00801Data(BigDecimal c00801Data) {
        this.c00801Data = c00801Data;
    }
    public String getc00801Flag() {
        return c00801Flag;
    }

    public void setc00801Flag(String c00801Flag) {
        this.c00801Flag = c00801Flag;
    }
    public BigDecimal getc00802Data() {
        return c00802Data;
    }

    public void setc00802Data(BigDecimal c00802Data) {
        this.c00802Data = c00802Data;
    }
    public String getc00802Flag() {
        return c00802Flag;
    }

    public void setc00802Flag(String c00802Flag) {
        this.c00802Flag = c00802Flag;
    }
    public BigDecimal getc00803Data() {
        return c00803Data;
    }

    public void setc00803Data(BigDecimal c00803Data) {
        this.c00803Data = c00803Data;
    }
    public String getc00803Flag() {
        return c00803Flag;
    }

    public void setc00803Flag(String c00803Flag) {
        this.c00803Flag = c00803Flag;
    }
    public BigDecimal getc00804Data() {
        return c00804Data;
    }

    public void setc00804Data(BigDecimal c00804Data) {
        this.c00804Data = c00804Data;
    }
    public String getc00804Flag() {
        return c00804Flag;
    }

    public void setc00804Flag(String c00804Flag) {
        this.c00804Flag = c00804Flag;
    }
    public BigDecimal getc00805Data() {
        return c00805Data;
    }

    public void setc00805Data(BigDecimal c00805Data) {
        this.c00805Data = c00805Data;
    }
    public String getc00805Flag() {
        return c00805Flag;
    }

    public void setc00805Flag(String c00805Flag) {
        this.c00805Flag = c00805Flag;
    }
    public BigDecimal getc00806Data() {
        return c00806Data;
    }

    public void setc00806Data(BigDecimal c00806Data) {
        this.c00806Data = c00806Data;
    }
    public String getc00806Flag() {
        return c00806Flag;
    }

    public void setc00806Flag(String c00806Flag) {
        this.c00806Flag = c00806Flag;
    }
    public BigDecimal getc00807Data() {
        return c00807Data;
    }

    public void setc00807Data(BigDecimal c00807Data) {
        this.c00807Data = c00807Data;
    }
    public String getc00807Flag() {
        return c00807Flag;
    }

    public void setc00807Flag(String c00807Flag) {
        this.c00807Flag = c00807Flag;
    }
    public BigDecimal getc00901Data() {
        return c00901Data;
    }

    public void setc00901Data(BigDecimal c00901Data) {
        this.c00901Data = c00901Data;
    }
    public String getc00901Flag() {
        return c00901Flag;
    }

    public void setc00901Flag(String c00901Flag) {
        this.c00901Flag = c00901Flag;
    }
    public BigDecimal getc00902Data() {
        return c00902Data;
    }

    public void setc00902Data(BigDecimal c00902Data) {
        this.c00902Data = c00902Data;
    }
    public String getc00902Flag() {
        return c00902Flag;
    }

    public void setc00902Flag(String c00902Flag) {
        this.c00902Flag = c00902Flag;
    }
    public BigDecimal getc00903Data() {
        return c00903Data;
    }

    public void setc00903Data(BigDecimal c00903Data) {
        this.c00903Data = c00903Data;
    }
    public String getc00903Flag() {
        return c00903Flag;
    }

    public void setc00903Flag(String c00903Flag) {
        this.c00903Flag = c00903Flag;
    }
    public BigDecimal getc00904Data() {
        return c00904Data;
    }

    public void setc00904Data(BigDecimal c00904Data) {
        this.c00904Data = c00904Data;
    }
    public String getc00904Flag() {
        return c00904Flag;
    }

    public void setc00904Flag(String c00904Flag) {
        this.c00904Flag = c00904Flag;
    }
    public BigDecimal getc00905Data() {
        return c00905Data;
    }

    public void setc00905Data(BigDecimal c00905Data) {
        this.c00905Data = c00905Data;
    }
    public String getc00905Flag() {
        return c00905Flag;
    }

    public void setc00905Flag(String c00905Flag) {
        this.c00905Flag = c00905Flag;
    }
    public BigDecimal getc00906Data() {
        return c00906Data;
    }

    public void setc00906Data(BigDecimal c00906Data) {
        this.c00906Data = c00906Data;
    }
    public String getc00906Flag() {
        return c00906Flag;
    }

    public void setc00906Flag(String c00906Flag) {
        this.c00906Flag = c00906Flag;
    }
    public BigDecimal getc00907Data() {
        return c00907Data;
    }

    public void setc00907Data(BigDecimal c00907Data) {
        this.c00907Data = c00907Data;
    }
    public String getc00907Flag() {
        return c00907Flag;
    }

    public void setc00907Flag(String c00907Flag) {
        this.c00907Flag = c00907Flag;
    }
    public BigDecimal getc01001Data() {
        return c01001Data;
    }

    public void setc01001Data(BigDecimal c01001Data) {
        this.c01001Data = c01001Data;
    }
    public String getc01001Flag() {
        return c01001Flag;
    }

    public void setc01001Flag(String c01001Flag) {
        this.c01001Flag = c01001Flag;
    }
    public BigDecimal getc01002Data() {
        return c01002Data;
    }

    public void setc01002Data(BigDecimal c01002Data) {
        this.c01002Data = c01002Data;
    }
    public String getc01002Flag() {
        return c01002Flag;
    }

    public void setc01002Flag(String c01002Flag) {
        this.c01002Flag = c01002Flag;
    }
    public BigDecimal getc01003Data() {
        return c01003Data;
    }

    public void setc01003Data(BigDecimal c01003Data) {
        this.c01003Data = c01003Data;
    }
    public String getc01003Flag() {
        return c01003Flag;
    }

    public void setc01003Flag(String c01003Flag) {
        this.c01003Flag = c01003Flag;
    }
    public BigDecimal getc01004Data() {
        return c01004Data;
    }

    public void setc01004Data(BigDecimal c01004Data) {
        this.c01004Data = c01004Data;
    }
    public String getc01004Flag() {
        return c01004Flag;
    }

    public void setc01004Flag(String c01004Flag) {
        this.c01004Flag = c01004Flag;
    }
    public BigDecimal getc01005Data() {
        return c01005Data;
    }

    public void setc01005Data(BigDecimal c01005Data) {
        this.c01005Data = c01005Data;
    }
    public String getc01005Flag() {
        return c01005Flag;
    }

    public void setc01005Flag(String c01005Flag) {
        this.c01005Flag = c01005Flag;
    }
    public BigDecimal getc01006Data() {
        return c01006Data;
    }

    public void setc01006Data(BigDecimal c01006Data) {
        this.c01006Data = c01006Data;
    }
    public String getc01006Flag() {
        return c01006Flag;
    }

    public void setc01006Flag(String c01006Flag) {
        this.c01006Flag = c01006Flag;
    }
    public BigDecimal getc01007Data() {
        return c01007Data;
    }

    public void setc01007Data(BigDecimal c01007Data) {
        this.c01007Data = c01007Data;
    }
    public String getc01007Flag() {
        return c01007Flag;
    }

    public void setc01007Flag(String c01007Flag) {
        this.c01007Flag = c01007Flag;
    }

    @Override
    public String toString() {
        return "TraficflowHour{" +
            "stationCode=" + stationCode +
            ", deviceCode=" + deviceCode +
            ", timepoint=" + timepoint +
            ", c00001Data=" + c00001Data +
            ", c00001Flag=" + c00001Flag +
            ", c00002Data=" + c00002Data +
            ", c00002Flag=" + c00002Flag +
            ", c00003Data=" + c00003Data +
            ", c00003Flag=" + c00003Flag +
            ", c00004Data=" + c00004Data +
            ", c00004Flag=" + c00004Flag +
            ", c00005Data=" + c00005Data +
            ", c00005Flag=" + c00005Flag +
            ", c00006Data=" + c00006Data +
            ", c00006Flag=" + c00006Flag +
            ", c00007Data=" + c00007Data +
            ", c00007Flag=" + c00007Flag +
            ", c00101Data=" + c00101Data +
            ", c00101Flag=" + c00101Flag +
            ", c00102Data=" + c00102Data +
            ", c00102Flag=" + c00102Flag +
            ", c00103Data=" + c00103Data +
            ", c00103Flag=" + c00103Flag +
            ", c00104Data=" + c00104Data +
            ", c00104Flag=" + c00104Flag +
            ", c00105Data=" + c00105Data +
            ", c00105Flag=" + c00105Flag +
            ", c00106Data=" + c00106Data +
            ", c00106Flag=" + c00106Flag +
            ", c00107Data=" + c00107Data +
            ", c00107Flag=" + c00107Flag +
            ", c00201Data=" + c00201Data +
            ", c00201Flag=" + c00201Flag +
            ", c00202Data=" + c00202Data +
            ", c00202Flag=" + c00202Flag +
            ", c00203Data=" + c00203Data +
            ", c00203Flag=" + c00203Flag +
            ", c00204Data=" + c00204Data +
            ", c00204Flag=" + c00204Flag +
            ", c00205Data=" + c00205Data +
            ", c00205Flag=" + c00205Flag +
            ", c00206Data=" + c00206Data +
            ", c00206Flag=" + c00206Flag +
            ", c00207Data=" + c00207Data +
            ", c00207Flag=" + c00207Flag +
            ", c00301Data=" + c00301Data +
            ", c00301Flag=" + c00301Flag +
            ", c00302Data=" + c00302Data +
            ", c00302Flag=" + c00302Flag +
            ", c00303Data=" + c00303Data +
            ", c00303Flag=" + c00303Flag +
            ", c00304Data=" + c00304Data +
            ", c00304Flag=" + c00304Flag +
            ", c00305Data=" + c00305Data +
            ", c00305Flag=" + c00305Flag +
            ", c00306Data=" + c00306Data +
            ", c00306Flag=" + c00306Flag +
            ", c00307Data=" + c00307Data +
            ", c00307Flag=" + c00307Flag +
            ", c00401Data=" + c00401Data +
            ", c00401Flag=" + c00401Flag +
            ", c00402Data=" + c00402Data +
            ", c00402Flag=" + c00402Flag +
            ", c00403Data=" + c00403Data +
            ", c00403Flag=" + c00403Flag +
            ", c00404Data=" + c00404Data +
            ", c00404Flag=" + c00404Flag +
            ", c00405Data=" + c00405Data +
            ", c00405Flag=" + c00405Flag +
            ", c00406Data=" + c00406Data +
            ", c00406Flag=" + c00406Flag +
            ", c00407Data=" + c00407Data +
            ", c00407Flag=" + c00407Flag +
            ", c00501Data=" + c00501Data +
            ", c00501Flag=" + c00501Flag +
            ", c00502Data=" + c00502Data +
            ", c00502Flag=" + c00502Flag +
            ", c00503Data=" + c00503Data +
            ", c00503Flag=" + c00503Flag +
            ", c00504Data=" + c00504Data +
            ", c00504Flag=" + c00504Flag +
            ", c00505Data=" + c00505Data +
            ", c00505Flag=" + c00505Flag +
            ", c00506Data=" + c00506Data +
            ", c00506Flag=" + c00506Flag +
            ", c00507Data=" + c00507Data +
            ", c00507Flag=" + c00507Flag +
            ", c00601Data=" + c00601Data +
            ", c00601Flag=" + c00601Flag +
            ", c00602Data=" + c00602Data +
            ", c00602Flag=" + c00602Flag +
            ", c00603Data=" + c00603Data +
            ", c00603Flag=" + c00603Flag +
            ", c00604Data=" + c00604Data +
            ", c00604Flag=" + c00604Flag +
            ", c00605Data=" + c00605Data +
            ", c00605Flag=" + c00605Flag +
            ", c00606Data=" + c00606Data +
            ", c00606Flag=" + c00606Flag +
            ", c00607Data=" + c00607Data +
            ", c00607Flag=" + c00607Flag +
            ", c00701Data=" + c00701Data +
            ", c00701Flag=" + c00701Flag +
            ", c00702Data=" + c00702Data +
            ", c00702Flag=" + c00702Flag +
            ", c00703Data=" + c00703Data +
            ", c00703Flag=" + c00703Flag +
            ", c00704Data=" + c00704Data +
            ", c00704Flag=" + c00704Flag +
            ", c00705Data=" + c00705Data +
            ", c00705Flag=" + c00705Flag +
            ", c00706Data=" + c00706Data +
            ", c00706Flag=" + c00706Flag +
            ", c00707Data=" + c00707Data +
            ", c00707Flag=" + c00707Flag +
            ", c00801Data=" + c00801Data +
            ", c00801Flag=" + c00801Flag +
            ", c00802Data=" + c00802Data +
            ", c00802Flag=" + c00802Flag +
            ", c00803Data=" + c00803Data +
            ", c00803Flag=" + c00803Flag +
            ", c00804Data=" + c00804Data +
            ", c00804Flag=" + c00804Flag +
            ", c00805Data=" + c00805Data +
            ", c00805Flag=" + c00805Flag +
            ", c00806Data=" + c00806Data +
            ", c00806Flag=" + c00806Flag +
            ", c00807Data=" + c00807Data +
            ", c00807Flag=" + c00807Flag +
            ", c00901Data=" + c00901Data +
            ", c00901Flag=" + c00901Flag +
            ", c00902Data=" + c00902Data +
            ", c00902Flag=" + c00902Flag +
            ", c00903Data=" + c00903Data +
            ", c00903Flag=" + c00903Flag +
            ", c00904Data=" + c00904Data +
            ", c00904Flag=" + c00904Flag +
            ", c00905Data=" + c00905Data +
            ", c00905Flag=" + c00905Flag +
            ", c00906Data=" + c00906Data +
            ", c00906Flag=" + c00906Flag +
            ", c00907Data=" + c00907Data +
            ", c00907Flag=" + c00907Flag +
            ", c01001Data=" + c01001Data +
            ", c01001Flag=" + c01001Flag +
            ", c01002Data=" + c01002Data +
            ", c01002Flag=" + c01002Flag +
            ", c01003Data=" + c01003Data +
            ", c01003Flag=" + c01003Flag +
            ", c01004Data=" + c01004Data +
            ", c01004Flag=" + c01004Flag +
            ", c01005Data=" + c01005Data +
            ", c01005Flag=" + c01005Flag +
            ", c01006Data=" + c01006Data +
            ", c01006Flag=" + c01006Flag +
            ", c01007Data=" + c01007Data +
            ", c01007Flag=" + c01007Flag +
        "}";
    }
}
