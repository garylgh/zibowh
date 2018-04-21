package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_operating_procedures_check`")
public class TOperatingProceduresCheck {
    @Id
    @Column(name = "`id`")
    private String id;

    @Column(name = "`BILL_ID`")
    private String billId;

    @Column(name = "`CZGC_ID`")
    private String czgcId;

    @Column(name = "`JCRY_ID`")
    private String jcryId;

    @Column(name = "`JC_TIME`")
    private Date jcTime;

    @Column(name = "`JC_RES`")
    private Integer jcRes;

    @Column(name = "`JC_NAME`")
    private String jcName;

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
     * @return CZGC_ID
     */
    public String getCzgcId() {
        return czgcId;
    }

    /**
     * @param czgcId
     */
    public void setCzgcId(String czgcId) {
        this.czgcId = czgcId == null ? null : czgcId.trim();
    }

    /**
     * @return JCRY_ID
     */
    public String getJcryId() {
        return jcryId;
    }

    /**
     * @param jcryId
     */
    public void setJcryId(String jcryId) {
        this.jcryId = jcryId == null ? null : jcryId.trim();
    }

    /**
     * @return JC_TIME
     */
    public Date getJcTime() {
        return jcTime;
    }

    /**
     * @param jcTime
     */
    public void setJcTime(Date jcTime) {
        this.jcTime = jcTime;
    }

    /**
     * @return JC_RES
     */
    public Integer getJcRes() {
        return jcRes;
    }

    /**
     * @param jcRes
     */
    public void setJcRes(Integer jcRes) {
        this.jcRes = jcRes;
    }

    /**
     * @return JC_NAME
     */
    public String getJcName() {
        return jcName;
    }

    /**
     * @param jcName
     */
    public void setJcName(String jcName) {
        this.jcName = jcName == null ? null : jcName.trim();
    }
}