package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`jc_result`")
public class JcResult {
    @Id
    @Column(name = "`id`")
    private String id;

    @Column(name = "`BILL_ID`")
    private String billId;

    @Column(name = "`JC_NAME`")
    private String jcName;

    @Column(name = "`JC_TIME`")
    private Date jcTime;

    @Column(name = "`JC_RES`")
    private Integer jcRes;

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
}