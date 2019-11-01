package com.zibowh.domain.entity.mbg;

import javax.persistence.*;

@Table(name = "`t_base_owner_mgrarea`")
public class TBaseOwnerMgrarea {
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`GOOD_NO`")
    private String goodNo;

    @Column(name = "`GOOD_NAME`")
    private String goodName;

    @Column(name = "`GOOD_LB`")
    private String goodLb;

    @Column(name = "`GOOD_XB`")
    private String goodXb;

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
     * @return GOOD_NO
     */
    public String getGoodNo() {
        return goodNo;
    }

    /**
     * @param goodNo
     */
    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo == null ? null : goodNo.trim();
    }

    /**
     * @return GOOD_NAME
     */
    public String getGoodName() {
        return goodName;
    }

    /**
     * @param goodName
     */
    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    /**
     * @return GOOD_LB
     */
    public String getGoodLb() {
        return goodLb;
    }

    /**
     * @param goodLb
     */
    public void setGoodLb(String goodLb) {
        this.goodLb = goodLb == null ? null : goodLb.trim();
    }

    /**
     * @return GOOD_XB
     */
    public String getGoodXb() {
        return goodXb;
    }

    /**
     * @param goodXb
     */
    public void setGoodXb(String goodXb) {
        this.goodXb = goodXb == null ? null : goodXb.trim();
    }
}