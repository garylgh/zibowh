package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`a_consignment_bill`")
public class AConsignmentBill {
    @Id
    @Column(name = "`id`")
    private String id;

    @Column(name = "`tyd_id`")
    private String tydId;

    @Column(name = "`single_time`")
    private Date singleTime;

    /**
     * 去状态表查询及变更，此处不做查询及变更
     */
    @Column(name = "`state`")
    private Integer state;

    @Column(name = "`distribution_time`")
    private Date distributionTime;

    @Column(name = "`distribution_person`")
    private String distributionPerson;

    @Column(name = "`receive_id`")
    private String receiveId;

    @Column(name = "`receive_unit`")
    private String receiveUnit;

    @Column(name = "`receive_unit_tel`")
    private String receiveUnitTel;

    @Column(name = "`receive_unit_contact`")
    private String receiveUnitContact;

    @Column(name = "`carrier_id`")
    private String carrierId;

    @Column(name = "`carrier_unit`")
    private String carrierUnit;

    @Column(name = "`carrier_unit_tel`")
    private String carrierUnitTel;

    @Column(name = "`carrier_unit_contact`")
    private String carrierUnitContact;

    @Column(name = "`consignment_id`")
    private String consignmentId;

    @Column(name = "`consignment_unit`")
    private String consignmentUnit;

    @Column(name = "`consignment_unit_tel`")
    private String consignmentUnitTel;

    @Column(name = "`consignment_unit_contact`")
    private String consignmentUnitContact;

    @Column(name = "`orders_id`")
    private String ordersId;

    @Column(name = "`orders_name`")
    private String ordersName;

    @Column(name = "`orders_time`")
    private Date ordersTime;

    @Column(name = "`reject_id`")
    private String rejectId;

    @Column(name = "`reject_name`")
    private String rejectName;

    @Column(name = "`reject_time`")
    private Date rejectTime;

    @Column(name = "`reject_reason`")
    private String rejectReason;

    @Column(name = "`finish_time`")
    private Date finishTime;

    @Column(name = "`upd_user`")
    private String updUser;

    @Column(name = "`upd_time`")
    private Date updTime;

    @Column(name = "`yj_time`")
    private Date yjTime;

    @Column(name = "`goods_name`")
    private String goodsName;

    @Column(name = "`goods_weight`")
    private Double goodsWeight;

    @Column(name = "`all_orders`")
    private Integer allOrders;

    @Column(name = "`chai_flg`")
    private Integer chaiFlg;

    @Column(name = "`delivery_address`")
    private String deliveryAddress;

    @Column(name = "`delivery_address_info`")
    private String deliveryAddressInfo;

    @Column(name = "`unload_address`")
    private String unloadAddress;

    @Column(name = "`unload_address_info`")
    private String unloadAddressInfo;

    @Column(name = "`surplus`")
    private String surplus;

    @Column(name = "`del_flg`")
    private Integer delFlg;

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
     * @return single_time
     */
    public Date getSingleTime() {
        return singleTime;
    }

    /**
     * @param singleTime
     */
    public void setSingleTime(Date singleTime) {
        this.singleTime = singleTime;
    }

    /**
     * 获取去状态表查询及变更，此处不做查询及变更
     *
     * @return state - 去状态表查询及变更，此处不做查询及变更
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置去状态表查询及变更，此处不做查询及变更
     *
     * @param state 去状态表查询及变更，此处不做查询及变更
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return distribution_time
     */
    public Date getDistributionTime() {
        return distributionTime;
    }

    /**
     * @param distributionTime
     */
    public void setDistributionTime(Date distributionTime) {
        this.distributionTime = distributionTime;
    }

    /**
     * @return distribution_person
     */
    public String getDistributionPerson() {
        return distributionPerson;
    }

    /**
     * @param distributionPerson
     */
    public void setDistributionPerson(String distributionPerson) {
        this.distributionPerson = distributionPerson == null ? null : distributionPerson.trim();
    }

    /**
     * @return receive_id
     */
    public String getReceiveId() {
        return receiveId;
    }

    /**
     * @param receiveId
     */
    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    /**
     * @return receive_unit
     */
    public String getReceiveUnit() {
        return receiveUnit;
    }

    /**
     * @param receiveUnit
     */
    public void setReceiveUnit(String receiveUnit) {
        this.receiveUnit = receiveUnit == null ? null : receiveUnit.trim();
    }

    /**
     * @return receive_unit_tel
     */
    public String getReceiveUnitTel() {
        return receiveUnitTel;
    }

    /**
     * @param receiveUnitTel
     */
    public void setReceiveUnitTel(String receiveUnitTel) {
        this.receiveUnitTel = receiveUnitTel == null ? null : receiveUnitTel.trim();
    }

    /**
     * @return receive_unit_contact
     */
    public String getReceiveUnitContact() {
        return receiveUnitContact;
    }

    /**
     * @param receiveUnitContact
     */
    public void setReceiveUnitContact(String receiveUnitContact) {
        this.receiveUnitContact = receiveUnitContact == null ? null : receiveUnitContact.trim();
    }

    /**
     * @return carrier_id
     */
    public String getCarrierId() {
        return carrierId;
    }

    /**
     * @param carrierId
     */
    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId == null ? null : carrierId.trim();
    }

    /**
     * @return carrier_unit
     */
    public String getCarrierUnit() {
        return carrierUnit;
    }

    /**
     * @param carrierUnit
     */
    public void setCarrierUnit(String carrierUnit) {
        this.carrierUnit = carrierUnit == null ? null : carrierUnit.trim();
    }

    /**
     * @return carrier_unit_tel
     */
    public String getCarrierUnitTel() {
        return carrierUnitTel;
    }

    /**
     * @param carrierUnitTel
     */
    public void setCarrierUnitTel(String carrierUnitTel) {
        this.carrierUnitTel = carrierUnitTel == null ? null : carrierUnitTel.trim();
    }

    /**
     * @return carrier_unit_contact
     */
    public String getCarrierUnitContact() {
        return carrierUnitContact;
    }

    /**
     * @param carrierUnitContact
     */
    public void setCarrierUnitContact(String carrierUnitContact) {
        this.carrierUnitContact = carrierUnitContact == null ? null : carrierUnitContact.trim();
    }

    /**
     * @return consignment_id
     */
    public String getConsignmentId() {
        return consignmentId;
    }

    /**
     * @param consignmentId
     */
    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId == null ? null : consignmentId.trim();
    }

    /**
     * @return consignment_unit
     */
    public String getConsignmentUnit() {
        return consignmentUnit;
    }

    /**
     * @param consignmentUnit
     */
    public void setConsignmentUnit(String consignmentUnit) {
        this.consignmentUnit = consignmentUnit == null ? null : consignmentUnit.trim();
    }

    /**
     * @return consignment_unit_tel
     */
    public String getConsignmentUnitTel() {
        return consignmentUnitTel;
    }

    /**
     * @param consignmentUnitTel
     */
    public void setConsignmentUnitTel(String consignmentUnitTel) {
        this.consignmentUnitTel = consignmentUnitTel == null ? null : consignmentUnitTel.trim();
    }

    /**
     * @return consignment_unit_contact
     */
    public String getConsignmentUnitContact() {
        return consignmentUnitContact;
    }

    /**
     * @param consignmentUnitContact
     */
    public void setConsignmentUnitContact(String consignmentUnitContact) {
        this.consignmentUnitContact = consignmentUnitContact == null ? null : consignmentUnitContact.trim();
    }

    /**
     * @return orders_id
     */
    public String getOrdersId() {
        return ordersId;
    }

    /**
     * @param ordersId
     */
    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId == null ? null : ordersId.trim();
    }

    /**
     * @return orders_name
     */
    public String getOrdersName() {
        return ordersName;
    }

    /**
     * @param ordersName
     */
    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName == null ? null : ordersName.trim();
    }

    /**
     * @return orders_time
     */
    public Date getOrdersTime() {
        return ordersTime;
    }

    /**
     * @param ordersTime
     */
    public void setOrdersTime(Date ordersTime) {
        this.ordersTime = ordersTime;
    }

    /**
     * @return reject_id
     */
    public String getRejectId() {
        return rejectId;
    }

    /**
     * @param rejectId
     */
    public void setRejectId(String rejectId) {
        this.rejectId = rejectId == null ? null : rejectId.trim();
    }

    /**
     * @return reject_name
     */
    public String getRejectName() {
        return rejectName;
    }

    /**
     * @param rejectName
     */
    public void setRejectName(String rejectName) {
        this.rejectName = rejectName == null ? null : rejectName.trim();
    }

    /**
     * @return reject_time
     */
    public Date getRejectTime() {
        return rejectTime;
    }

    /**
     * @param rejectTime
     */
    public void setRejectTime(Date rejectTime) {
        this.rejectTime = rejectTime;
    }

    /**
     * @return reject_reason
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * @param rejectReason
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    /**
     * @return finish_time
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * @param finishTime
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * @return upd_user
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
     * @return upd_time
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

    /**
     * @return yj_time
     */
    public Date getYjTime() {
        return yjTime;
    }

    /**
     * @param yjTime
     */
    public void setYjTime(Date yjTime) {
        this.yjTime = yjTime;
    }

    /**
     * @return goods_name
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
     * @return goods_weight
     */
    public Double getGoodsWeight() {
        return goodsWeight;
    }

    /**
     * @param goodsWeight
     */
    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /**
     * @return all_orders
     */
    public Integer getAllOrders() {
        return allOrders;
    }

    /**
     * @param allOrders
     */
    public void setAllOrders(Integer allOrders) {
        this.allOrders = allOrders;
    }

    /**
     * @return chai_flg
     */
    public Integer getChaiFlg() {
        return chaiFlg;
    }

    /**
     * @param chaiFlg
     */
    public void setChaiFlg(Integer chaiFlg) {
        this.chaiFlg = chaiFlg;
    }

    /**
     * @return delivery_address
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * @param deliveryAddress
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    /**
     * @return delivery_address_info
     */
    public String getDeliveryAddressInfo() {
        return deliveryAddressInfo;
    }

    /**
     * @param deliveryAddressInfo
     */
    public void setDeliveryAddressInfo(String deliveryAddressInfo) {
        this.deliveryAddressInfo = deliveryAddressInfo == null ? null : deliveryAddressInfo.trim();
    }

    /**
     * @return unload_address
     */
    public String getUnloadAddress() {
        return unloadAddress;
    }

    /**
     * @param unloadAddress
     */
    public void setUnloadAddress(String unloadAddress) {
        this.unloadAddress = unloadAddress == null ? null : unloadAddress.trim();
    }

    /**
     * @return unload_address_info
     */
    public String getUnloadAddressInfo() {
        return unloadAddressInfo;
    }

    /**
     * @param unloadAddressInfo
     */
    public void setUnloadAddressInfo(String unloadAddressInfo) {
        this.unloadAddressInfo = unloadAddressInfo == null ? null : unloadAddressInfo.trim();
    }

    /**
     * @return surplus
     */
    public String getSurplus() {
        return surplus;
    }

    /**
     * @param surplus
     */
    public void setSurplus(String surplus) {
        this.surplus = surplus == null ? null : surplus.trim();
    }

    /**
     * @return del_flg
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
}