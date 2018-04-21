package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`sxtsb_tab`")
public class SxtsbTab {
    @Id
    @Column(name = "`ID`")
    private Long id;

    @Column(name = "`EQUIPMEN_NO`")
    private String equipmenNo;

    @Column(name = "`EQUIPMEN_STATUS`")
    private String equipmenStatus;

    @Column(name = "`TYPE`")
    private String type;

    @Column(name = "`USER_ID`")
    private String userId;

    @Column(name = "`PASSWORD`")
    private String password;

    @Column(name = "`GROUPID`")
    private String groupid;

    @Column(name = "`NAME`")
    private String name;

    @Column(name = "`LON`")
    private String lon;

    @Column(name = "`LAT`")
    private String lat;

    @Column(name = "`AFFILIATED_ENTERPRISE_ID`")
    private String affiliatedEnterpriseId;

    @Column(name = "`RESERVE_COL_4`")
    private String reserveCol4;

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
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
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
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return GROUPID
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * @param groupid
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * @return RESERVE_COL_4
     */
    public String getReserveCol4() {
        return reserveCol4;
    }

    /**
     * @param reserveCol4
     */
    public void setReserveCol4(String reserveCol4) {
        this.reserveCol4 = reserveCol4 == null ? null : reserveCol4.trim();
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