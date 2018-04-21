package com.zibowh.controllers.api.deliveryBiz;

import com.github.pagehelper.PageInfo;
import com.zibowh.controllers.api.APIController;
import com.zibowh.controllers.response.BaseResponse;
import com.zibowh.controllers.response.payload.BizBill;
import com.zibowh.controllers.response.payload.CheckResultBeforeDeparture;
import io.swagger.annotations.*;
import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeliveryBizController extends APIController {

    @Data
    @ApiModel
    public static class AcceptRequest {
        @ApiModelProperty(value = "true = 接单 false = 拒单")
        boolean accept;
        @ApiModelProperty(value = "车辆id")
        String vechileId;
        @ApiModelProperty(value = "运单id")
        String bizBillId;
    }

    @PatchMapping(value = apiPath + "delivery_biz/accept")
    @ApiOperation(value = "接单或者拒单 消费方:车载APP")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<BizBill> accept(
            @RequestBody AcceptRequest request
    ) {
        throw new RuntimeException("stub");
    }

    @GetMapping(value = apiPath + "delivery_biz/{id}")
    @ApiOperation(value = "运单详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<BizBill> detail(
            @ApiParam(allowEmptyValue = true, value = "运单id")
            @PathVariable(value = "id") String id
    ) {
        throw new RuntimeException("stub");
    }

    @GetMapping(value = apiPath + "delivery_biz/search")
    @ApiOperation(value = "查询推送运单一览查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = "page", defaultValue = "0", value = "分页页码数,从0开始", dataType = "integer", paramType = "query"),
            @ApiImplicitParam(name = "size", defaultValue = "200", value = "每页条数", dataType = "integer", paramType = "query")
    })
    public BaseResponse<PageInfo<BizBill>> search(
            @ApiParam(allowEmptyValue = true, value = "是否推送成功")
            @RequestParam(value = "pushed", required = false) Boolean pushed,
            @ApiParam(allowEmptyValue = true, value = "被推送车辆id")
            @RequestParam(value = "vehicleId", required = false) String vehicleId,
            @PageableDefault Pageable pageable
    ) {
        throw new RuntimeException("stub");
    }

    @GetMapping(value = apiPath + "delivery_biz/{id}/check_result_before_departure")
    @ApiOperation(value = "查询出车前检查信息一览 消费方:车载APP")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<CheckResultBeforeDeparture> getCheckBeforeDeparture(
            @ApiParam(allowEmptyValue = true, value = "运单id")
            @PathVariable(value = "id") String id
    ) {
        throw new RuntimeException("stub");
    }

    @PostMapping(value = apiPath + "delivery_biz/{id}/check_result_before_departure")
    @ApiOperation(value = "保存出车前检查结果")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<CheckResultBeforeDeparture> saveCheckResultBeforeDeparture(
            @ApiParam(allowEmptyValue = true, value = "运单id")
            @PathVariable(value = "id") String id
    ) {
        throw new RuntimeException("stub");
    }

    @PatchMapping(value = apiPath + "delivery_biz/{id}/departure/start")
    @ApiOperation(value = "手动触发装货入场流程 消费方:车载APP 场景: 发货企业是外地")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<String> startDeparture(
            @ApiParam(allowEmptyValue = true, value = "运单id")
            @PathVariable(value = "id") String id
    ) {
        throw new RuntimeException("stub");
    }

    @PatchMapping(value = apiPath + "delivery_biz/{id}/arrival/start")
    @ApiOperation(value = "手动触发卸货入场流程 消费方:车载APP 场景: 收货企业是外地")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<String> startArrival(
            @ApiParam(allowEmptyValue = true, value = "运单id")
            @PathVariable(value = "id") String id
    ) {
        throw new RuntimeException("stub");
    }


}
