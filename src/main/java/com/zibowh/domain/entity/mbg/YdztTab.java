package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`ydzt_tab`")
public class YdztTab {
    @Id
    @Column(name = "`id`")
    private String id;

    @Column(name = "`tyd_id`")
    private String tydId;

    @Column(name = "`BILL_ID`")
    private String billId;

    @Column(name = "`YD_TYPE`")
    private Integer ydType;

    @Column(name = "`TS_TYPE`")
    private Integer tsType;

    @Column(name = "`JD_TYPE`")
    private Integer jdType;

    @Column(name = "`JD_TIME`")
    private Date jdTime;

    @Column(name = "`TS_TIME`")
    private Date tsTime;

    /**
     * @return id
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
     * @return tyd_id
     */
    public String getTydId() {
        return tydId;
    }

    /**
     * @param tydId
     */
    public void setTydId(String tydId) {
        this.tydId = tydId == null ? null : tydId.trim();
    }

    /**
     * @return BILL_ID
     */
    public String getBillId() {
        return billId;
    }

    /**
     * @param billId
     */
    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    /**
     * @return YD_TYPE
     */
    public Integer getYdType() {
        return ydType;
    }

    /**
     * @param ydType
     */
    public void setYdType(Integer ydType) {
        this.ydType = ydType;
    }

    /**
     * @return TS_TYPE
     */
    public Integer getTsType() {
        return tsType;
    }

    /**
     * @param tsType
     */
    public void setTsType(Integer tsType) {
        this.tsType = tsType;
    }

    /**
     * @return JD_TYPE
     */
    public Integer getJdType() {
        return jdType;
    }

    /**
     * @param jdType
     */
    public void setJdType(Integer jdType) {
        this.jdType = jdType;
    }

    /**
     * @return JD_TIME
     */
    public Date getJdTime() {
        return jdTime;
    }

    /**
     * @param jdTime
     */
    public void setJdTime(Date jdTime) {
        this.jdTime = jdTime;
    }

    /**
     * @return TS_TIME
     */
    public Date getTsTime() {
        return tsTime;
    }

    /**
     * @param tsTime
     */
    public void setTsTime(Date tsTime) {
        this.tsTime = tsTime;
    }
}