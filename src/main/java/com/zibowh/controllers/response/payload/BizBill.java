package com.zibowh.controllers.response.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "电子运单表")
public class BizBill {
    @ApiModelProperty(notes = "运单主键")
    private String billNo;
    @ApiModelProperty(notes = "运单编号")
    private String billNum;
    @ApiModelProperty(notes = "企业ID")
    private String ownerId;
    @ApiModelProperty(notes = "企业类型")
    private int onwerType;
    @ApiModelProperty(notes = "运单来源")
    private int billType;
    @ApiModelProperty(notes = "运单状态")
    private String billStatus;
    @ApiModelProperty(notes = "二维码串值")
    private String qrCode;
    @ApiModelProperty(notes = "运单生成时间")
    private Date billEgntTime;
    @ApiModelProperty(notes = "托运方名称")
    private String sName;
    @ApiModelProperty(notes = "托运方联系电话")
    private String sTel;
    @ApiModelProperty(notes = "装货地址")
    private String startPos;
    @ApiModelProperty(notes = "装货地址行政区划")
    private String sZipCode;
    @ApiModelProperty(notes = "装货日期")
    private Date loadDate;
    @ApiModelProperty(notes = "卸货日期")
    private Date UnloadDate;
    @ApiModelProperty(notes = "货物信息")
    private String goodsInfo;
    @ApiModelProperty(notes = "线路id")
    private String lineId;
    @ApiModelProperty(notes = "线路描述")
    private String lineName;
    @ApiModelProperty(notes = "线路里程")
    private Float lineMile;
    @ApiModelProperty(notes = "承运方企业id")
    private String ysNameId;
    @ApiModelProperty(notes = "承运方点位名称")
    private String ysName;
    @ApiModelProperty(notes = "承运方经营许可证号")
    private String ysMcertId;
    @ApiModelProperty(notes = "承运企业联系电话")
    private String ysSenttel;
    @ApiModelProperty(notes = "车辆id")
    private String vehicleId;
    @ApiModelProperty(notes = "车牌号码")
    private String vehicleCode;
    @ApiModelProperty(notes = "道路运输证号")
    private String cCertId;
    @ApiModelProperty(notes = "挂车id")
    private String gVehicleId;
    @ApiModelProperty(notes = "挂车牌照号码")
    private String gVehicleCode;
}
