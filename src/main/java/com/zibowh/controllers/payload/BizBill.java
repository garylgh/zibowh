package com.zibowh.controllers.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel(description = "电子运单表")
public class BizBill {
    @ApiModelProperty(value = "运单主键")
    private String billNo;
    @ApiModelProperty(value = "运单编号")
    private String billNum;
    @ApiModelProperty(value ="企业ID")
    private String ownerId;
    @ApiModelProperty(value ="企业类型")
    private int onwerType;
    @ApiModelProperty(value ="运单来源")
    private int billType;
    @ApiModelProperty(value ="运单状态")
    private String billStatus;
    @ApiModelProperty(value ="二维码串值")
    private String qrCode;
    @ApiModelProperty(value ="运单生成时间")
    private Date billEgntTime;
    @ApiModelProperty(value ="托运方名称")
    private String sname;
    @ApiModelProperty(value ="托运方联系电话")
    private String stel;
    @ApiModelProperty(value ="装货地址")
    private String startPos;
    @ApiModelProperty(value ="装货地址行政区划")
    private String szipCode;
    @ApiModelProperty(value ="装货日期")
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date loadDate;
    @ApiModelProperty(value ="卸货日期")
    private Date unloadDate;
    @ApiModelProperty(value ="货物信息")
    private String goodsInfo;
    @ApiModelProperty(value ="线路id")
    private String lineId;
    @ApiModelProperty(value ="线路描述")
    private String lineName;
    @ApiModelProperty(value ="线路里程")
    private Float lineMile;
    @ApiModelProperty(value ="承运方企业id")
    private String ysNameId;
    @ApiModelProperty(value ="承运方点位名称")
    private String ysName;
    @ApiModelProperty(value ="承运方经营许可证号")
    private String ysMcertId;
    @ApiModelProperty(value ="承运企业联系电话")
    private String ysSenttel;
    @ApiModelProperty(value ="车辆id")
    private String vehicleId;
    @ApiModelProperty(value ="车牌号码")
    private String vehicleCode;
    @ApiModelProperty(value ="道路运输证号")
    private String ccertId;
    @ApiModelProperty(value ="挂车id")
    private String gvehicleId;
    @ApiModelProperty(value ="挂车牌照号码")
    private String gvehicleCode;
}
