package com.zibowh.controllers.api;

import com.github.pagehelper.PageInfo;
import com.zibowh.controllers.payload.BizBill;
import com.zibowh.controllers.response.BaseResponse;
import com.zibowh.domain.entity.mbg.Jcszx;
import io.swagger.annotations.*;
import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "承运单管理")
public class CydController extends APIController {

    public static final String apiPath = apiBasePath + "/delivery_biz/";

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

    @PatchMapping(value = apiPath + "accept")
    @ApiOperation(value = "接单或者拒单 消费方:车载APP")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<BizBill> accept(
            @RequestBody AcceptRequest request
    ) {
        throw new RuntimeException("stub");
    }

    @GetMapping(value = apiPath + "{id}")
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

    @GetMapping(value = apiPath + "search")
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

    @GetMapping(value = apiPath + "{id}/check/before/departure")
    @ApiOperation(value = "查询出车前检查信息一览 消费方:车载APP")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<List<Jcszx>> getCheckBeforeDeparture(
            @ApiParam(allowEmptyValue = true, value = "运单id")
            @PathVariable(value = "id") String id
    ) {
        /**
         * `检查设置项` 中的ownerId(所属单位id)关联的是哪个外键呢
         */
        throw new RuntimeException("stub");
    }

    @PostMapping(value = apiPath + "{id}/check/before/departure")
    @ApiOperation(value = "保存出车前检查结果")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<List<Jcszx>> saveCheckBeforeDeparture(
            @ApiParam(allowEmptyValue = true, value = "运单id")
            @PathVariable(value = "id") String id
    ) {
        throw new RuntimeException("stub");
    }

}
