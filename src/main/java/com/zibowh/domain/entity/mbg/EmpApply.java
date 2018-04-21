package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`emp_apply`")
public class EmpApply {
    @Id
    @Column(name = "`APPLY_ID`")
    private String applyId;

    @Column(name = "`APPLYTIME`")
    private Date applytime;

    @Column(name = "`APPLYPEOPLE`")
    private String applypeople;

    @Column(name = "`APPLYSTATE`")
    private String applystate;

    @Column(name = "`OPERATION`")
    private String operation;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`TOWNSHIPRS`")
    private Integer townshiprs;

    @Column(name = "`COUNTYRS`")
    private Integer countyrs;

    @Column(name = "`CITYRS`")
    private Integer cityrs;

    @Column(name = "`RESUT`")
    private String resut;

    @Column(name = "`CREAT_USER`")
    private String creatUser;

    @Column(name = "`CREAT_TIME`")
    private Date creatTime;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

    /**
     * @return APPLY_ID
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * @param applyId
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * @return APPLYTIME
     */
    public Date getApplytime() {
        return applytime;
    }

    /**
     * @param applytime
     */
    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    /**
     * @return APPLYPEOPLE
     */
    public String getApplypeople() {
        return applypeople;
    }

    /**
     * @param applypeople
     */
    public void setApplypeople(String applypeople) {
        this.applypeople = applypeople == null ? null : applypeople.trim();
    }

    /**
     * @return APPLYSTATE
     */
    public String getApplystate() {
        return applystate;
    }

    /**
     * @param applystate
     */
    public void setApplystate(String applystate) {
        this.applystate = applystate == null ? null : applystate.trim();
    }

    /**
     * @return OPERATION
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * @return OWNER_ID
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    /**
     * @return TOWNSHIPRS
     */
    public Integer getTownshiprs() {
        return townshiprs;
    }

    /**
     * @param townshiprs
     */
    public void setTownshiprs(Integer townshiprs) {
        this.townshiprs = townshiprs;
    }

    /**
     * @return COUNTYRS
     */
    public Integer getCountyrs() {
        return countyrs;
    }

    /**
     * @param countyrs
     */
    public void setCountyrs(Integer countyrs) {
        this.countyrs = countyrs;
    }

    /**
     * @return CITYRS
     */
    public Integer getCityrs() {
        return cityrs;
    }

    /**
     * @param cityrs
     */
    public void setCityrs(Integer cityrs) {
        this.cityrs = cityrs;
    }

    /**
     * @return RESUT
     */
    public String getResut() {
        return resut;
    }

    /**
     * @param resut
     */
    public void setResut(String resut) {
        this.resut = resut == null ? null : resut.trim();
    }

    /**
     * @return CREAT_USER
     */
    public String getCreatUser() {
        return creatUser;
    }

    /**
     * @param creatUser
     */
    public void setCreatUser(String creatUser) {
        this.creatUser = creatUser == null ? null : creatUser.trim();
    }

    /**
     * @return CREAT_TIME
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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