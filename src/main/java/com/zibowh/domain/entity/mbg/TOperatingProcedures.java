package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_operating_procedures`")
public class TOperatingProcedures {
    @Id
    @Column(name = "`ID`")
    private Long id;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`GOODS_UN`")
    private String goodsUn;

    @Column(name = "`GOODS_NAME`")
    private String goodsName;

    @Column(name = "`OP_KIND`")
    private Integer opKind;

    @Column(name = "`OP_NUMBER`")
    private Integer opNumber;

    @Column(name = "`OP_TYPE`")
    private Integer opType;

    @Column(name = "`OP_INFO`")
    private Integer opInfo;

    @Column(name = "`DEL_FLG`")
    private Integer delFlg;

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
     * @return GOODS_UN
     */
    public String getGoodsUn() {
        return goodsUn;
    }

    /**
     * @param goodsUn
     */
    public void setGoodsUn(String goodsUn) {
        this.goodsUn = goodsUn == null ? null : goodsUn.trim();
    }

    /**
     * @return GOODS_NAME
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * @param goodsName
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * @return OP_KIND
     */
    public Integer getOpKind() {
        return opKind;
    }

    /**
     * @param opKind
     */
    public void setOpKind(Integer opKind) {
        this.opKind = opKind;
    }

    /**
     * @return OP_NUMBER
     */
    public Integer getOpNumber() {
        return opNumber;
    }

    /**
     * @param opNumber
     */
    public void setOpNumber(Integer opNumber) {
        this.opNumber = opNumber;
    }

    /**
     * @return OP_TYPE
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * @param opType
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    /**
     * @return OP_INFO
     */
    public Integer getOpInfo() {
        return opInfo;
    }

    /**
     * @param opInfo
     */
    public void setOpInfo(Integer opInfo) {
        this.opInfo = opInfo;
    }

    /**
     * @return DEL_FLG
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /**
     * @param delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
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