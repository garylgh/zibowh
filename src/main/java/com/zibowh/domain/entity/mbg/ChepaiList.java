package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`chepai_list`")
public class ChepaiList {
    @Id
    @Column(name = "`ID`")
    private Integer id;

    @Column(name = "`EQUIPMEN_NO`")
    private String equipmenNo;

    @Column(name = "`EQUIPMEN_NAME`")
    private String equipmenName;

    @Column(name = "`EQUIPMEN_STATUS`")
    private String equipmenStatus;

    @Column(name = "`TYPE`")
    private String type;

    @Column(name = "`LON`")
    private String lon;

    @Column(name = "`LAT`")
    private String lat;

    @Column(name = "`AFFILIATED_ENTERPRISE_ID`")
    private String affiliatedEnterpriseId;

    @Column(name = "`ISDATE`")
    private Date isdate;

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
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return EQUIPMEN_NO
     */
    public String getEquipmenNo() {
        return equipmenNo;
    }

    /**
     * @param equipmenNo
     */
    public void setEquipmenNo(String equipmenNo) {
        this.equipmenNo = equipmenNo == null ? null : equipmenNo.trim();
    }

    /**
     * @return EQUIPMEN_NAME
     */
    public String getEquipmenName() {
        return equipmenName;
    }

    /**
     * @param equipmenName
     */
    public void setEquipmenName(String equipmenName) {
        this.equipmenName = equipmenName == null ? null : equipmenName.trim();
    }

    /**
     * @return EQUIPMEN_STATUS
     */
    public String getEquipmenStatus() {
        return equipmenStatus;
    }

    /**
     * @param equipmenStatus
     */
    public void setEquipmenStatus(String equipmenStatus) {
        this.equipmenStatus = equipmenStatus == null ? null : equipmenStatus.trim();
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * @return ISDATE
     */
    public Date getIsdate() {
        return isdate;
    }

    /**
     * @param isdate
     */
    public void setIsdate(Date isdate) {
        this.isdate = isdate;
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