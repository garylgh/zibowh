package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`eidlist`")
public class Eidlist {
    @Id
    @Column(name = "`EID_ID`")
    private String eidId;

    @Column(name = "`CARD_NO`")
    private String cardNo;

    @Column(name = "`EID_BINDING_TIME`")
    private Date eidBindingTime;

    @Column(name = "`EID_TYPE`")
    private Integer eidType;

    @Column(name = "`EID_TIME`")
    private Date eidTime;

    /**
     * @return EID_ID
     */
    public String getEidId() {
        return eidId;
    }

    /**
     * @param eidId
     */
    public void setEidId(String eidId) {
        this.eidId = eidId == null ? null : eidId.trim();
    }

    /**
     * @return CARD_NO
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * @return EID_BINDING_TIME
     */
    public Date getEidBindingTime() {
        return eidBindingTime;
    }

    /**
     * @param eidBindingTime
     */
    public void setEidBindingTime(Date eidBindingTime) {
        this.eidBindingTime = eidBindingTime;
    }

    /**
     * @return EID_TYPE
     */
    public Integer getEidType() {
        return eidType;
    }

    /**
     * @param eidType
     */
    public void setEidType(Integer eidType) {
        this.eidType = eidType;
    }

    /**
     * @return EID_TIME
     */
    public Date getEidTime() {
        return eidTime;
    }

    /**
     * @param eidTime
     */
    public void setEidTime(Date eidTime) {
        this.eidTime = eidTime;
    }
}