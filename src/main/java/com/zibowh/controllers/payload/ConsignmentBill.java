package com.zibowh.controllers.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(description = "托运单表")
@Data
public class ConsignmentBill {
    @ApiModelProperty(value = "托运单主键")
    private String id;
    @ApiModelProperty(value = "托运单编号")
    private String billNo;
    @ApiModelProperty(value = "下单时间")
    private Date singleTime;
    @ApiModelProperty(value = "状态")
    private int state;
    @ApiModelProperty(value = "派发时间")
    private Date distributionTime;
    @ApiModelProperty(value = "派发人")
    private String distributionPerson;
    @ApiModelProperty(value = "收货单位id")
    private String receiveId;
    @ApiModelProperty(value = "收货单位")
    private String receiveUnit;
    @ApiModelProperty(value = "收货单位联系电话")
    private String receiveUnitTel;
    @ApiModelProperty(value = "收货单位联系人")
    private String receiveUnitContact;
    @ApiModelProperty(value = "承运单位id")
    private String carrierId;
    @ApiModelProperty(value = "承运单位")
    private String carrierUnit;
    @ApiModelProperty(value = "承运单位联系电话")
    private String carrierUnitTel;
    @ApiModelProperty(value = "承运单位联系人")
    private String carrierUnitContact;
    @ApiModelProperty(value = "托运单位id")
    private String consignmentId;
    @ApiModelProperty(value = "托运单位")
    private String consignmentUnit;
    @ApiModelProperty(value = "托运单位联系电话")
    private String consignmentUnitTel;
    @ApiModelProperty(value = "托运单位联系人")
    private String consignmentUnitContact;
    @ApiModelProperty(value = "接单人id")
    private String ordersId;
    @ApiModelProperty(value = "接单人姓名")
    private String ordersName;
    @ApiModelProperty(value = "截单时间")
    private Date ordersTime;
    @ApiModelProperty(value = "驳回人id")
    private String rejectId;
    @ApiModelProperty(value = "驳回人姓名")
    private String rejectName;
    @ApiModelProperty(value = "驳回时间")
    private String rejectTime;
    @ApiModelProperty(value = "驳回原因")
    private String rejectReason;
    @ApiModelProperty(value = "完成时间")
    private Date finishTime;
    @ApiModelProperty(value = "更新者")
    private String updUser;
    @ApiModelProperty(value = "更新时间")
    private Date updTime;
    @ApiModelProperty(value = "预计装货日期")
    private Date estimateUnloadDate;
    @ApiModelProperty(value = "货物名称")
    private String goodsName;
    @ApiModelProperty(value = "货物重量")
    private double goodsWeight;
    @ApiModelProperty(value = "是否全部接单")
    private boolean allOrders;
    @ApiModelProperty(value = "托运单是否全部调度")
    private boolean chaiFlg;
    @ApiModelProperty(value = "发货地址")
    private String deliveryAddress;
    @ApiModelProperty(value = "发货地址详细")
    private String deliveryAddressInfo;
    @ApiModelProperty(value = "卸货地址")
    private String unloadAddress;
    @ApiModelProperty(value = "卸货地址详细")
    private String unloadAddressInfo;
    @ApiModelProperty(value = "调度剩余量")
    private String surplus;
    @ApiModelProperty(value = "是否作废")
    private boolean delFlg;
}
