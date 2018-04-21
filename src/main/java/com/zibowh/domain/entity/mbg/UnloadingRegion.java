package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`unloading_region`")
public class UnloadingRegion {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`INOUTLOADINGER_REGION_NO`")
    private String inoutloadingerRegionNo;

    @Column(name = "`ZXQYMC`")
    private String zxqymc;

    @Column(name = "`STATUS`")
    private String status;

    @Column(name = "`ZXQLX`")
    private String zxqlx;

    @Column(name = "`ZXHWNO`")
    private String zxhwno;

    @Column(name = "`ZXHWMC`")
    private String zxhwmc;

    @Column(name = "`INPUT_DATE`")
    private Date inputDate;

    @Column(name = "`ELECTRONIC_FENCE_INFO`")
    private String electronicFenceInfo;

    @Column(name = "`LON`")
    private String lon;

    @Column(name = "`LAT`")
    private String lat;

    @Column(name = "`LONGA`")
    private Double longa;

    @Column(name = "`WIDE`")
    private Double wide;

    @Column(name = "`VOLUME`")
    private Double volume;

    @Column(name = "`AFFILIATED_ENTERPRISE_ID`")
    private String affiliatedEnterpriseId;

    @Column(name = "`INS_USER`")
    private String insUser;

    @Column(name = "`INS_TIME`")
    private Date insTime;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return INOUTLOADINGER_REGION_NO
     */
    public String getInoutloadingerRegionNo() {
        return inoutloadingerRegionNo;
    }

    /**
     * @param inoutloadingerRegionNo
     */
    public void setInoutloadingerRegionNo(String inoutloadingerRegionNo) {
        this.inoutloadingerRegionNo = inoutloadingerRegionNo == null ? null : inoutloadingerRegionNo.trim();
    }

    /**
     * @return ZXQYMC
     */
    public String getZxqymc() {
        return zxqymc;
    }

    /**
     * @param zxqymc
     */
    public void setZxqymc(String zxqymc) {
        this.zxqymc = zxqymc == null ? null : zxqymc.trim();
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return ZXQLX
     */
    public String getZxqlx() {
        return zxqlx;
    }

    /**
     * @param zxqlx
     */
    public void setZxqlx(String zxqlx) {
        this.zxqlx = zxqlx == null ? null : zxqlx.trim();
    }

    /**
     * @return ZXHWNO
     */
    public String getZxhwno() {
        return zxhwno;
    }

    /**
     * @param zxhwno
     */
    public void setZxhwno(String zxhwno) {
        this.zxhwno = zxhwno == null ? null : zxhwno.trim();
    }

    /**
     * @return ZXHWMC
     */
    public String getZxhwmc() {
        return zxhwmc;
    }

    /**
     * @param zxhwmc
     */
    public void setZxhwmc(String zxhwmc) {
        this.zxhwmc = zxhwmc == null ? null : zxhwmc.trim();
    }

    /**
     * @return INPUT_DATE
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * @param inputDate
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    /**
     * @return ELECTRONIC_FENCE_INFO
     */
    public String getElectronicFenceInfo() {
        return electronicFenceInfo;
    }

    /**
     * @param electronicFenceInfo
     */
    public void setElectronicFenceInfo(String electronicFenceInfo) {
        this.electronicFenceInfo = electronicFenceInfo == null ? null : electronicFenceInfo.trim();
    }

    /**
     * @return LON
     */
    public String getLon() {
        return lon;
    }

    /**
     * @param lon
     */
    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    /**
     * @return LAT
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * @return LONGA
     */
    public Double getLonga() {
        return longa;
    }

    /**
     * @param longa
     */
    public void setLonga(Double longa) {
        this.longa = longa;
    }

    /**
     * @return WIDE
     */
    public Double getWide() {
        return wide;
    }

    /**
     * @param wide
     */
    public void setWide(Double wide) {
        this.wide = wide;
    }

    /**
     * @return VOLUME
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * @param volume
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /**
     * @return AFFILIATED_ENTERPRISE_ID
     */
    public String getAffiliatedEnterpriseId() {
        return affiliatedEnterpriseId;
    }

    /**
     * @param affiliatedEnterpriseId
     */
    public void setAffiliatedEnterpriseId(String affiliatedEnterpriseId) {
        this.affiliatedEnterpriseId = affiliatedEnterpriseId == null ? null : affiliatedEnterpriseId.trim();
    }

    /**
     * @return INS_USER
     */
    public String getInsUser() {
        return insUser;
    }

    /**
     * @param insUser
     */
    public void setInsUser(String insUser) {
        this.insUser = insUser == null ? null : insUser.trim();
    }

    /**
     * @return INS_TIME
     */
    public Date getInsTime() {
        return insTime;
    }

    /**
     * @param insTime
     */
    public void setInsTime(Date insTime) {
        this.insTime = insTime;
    }

    /**
     * @return UPD_USER
     */
    public String getUpdUser() {
        return updUser;
    }

    /**
     * @param updUser
     */
    public void setUpdUser(String updUser) {
        this.updUser = updUser == null ? null : updUser.trim();
    }

    /**
     * @return UPD_TIME
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * @param updTime
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}