package com.zibowh.controllers.api;

import com.github.pagehelper.PageInfo;
import com.zibowh.controllers.payload.ConsignmentBill;
import com.zibowh.controllers.response.BaseResponse;
import com.zibowh.domain.entity.mbg.TOperatingProcedures;
import com.zibowh.domain.entity.mbg.WdcyxxTab;
import io.swagger.annotations.*;
import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@Api(value = "在途运单管理")
public class WayBillController extends APIController {

    public static final String apiPath = apiBasePath + "/wayBill/";

    @GetMapping(value = apiPath + "/search")
    @ApiOperation(value = "查询在途运单一览")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = "page", defaultValue = "0", value = "分页页码数,从0开始", dataType = "integer", paramType = "query"),
            @ApiImplicitParam(name = "size", defaultValue = "200", value = "每页条数", dataType = "integer", paramType = "query")
    })
    public BaseResponse<PageInfo<ConsignmentBill>> search(
            @ApiParam(allowEmptyValue = false, value = "危化企业id")
            @RequestParam(value = "companyId") String companyId,
            @PageableDefault Pageable pageable
    ) {
        throw new RuntimeException("stub");
    }

    @GetMapping(value = apiPath + "/{wayBillId}")
    @ApiOperation(value = "查询运单详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<ConsignmentBill> detail(
            @ApiParam(allowEmptyValue = false, value = "在途运单id")
            @RequestParam(value = "wayBillId") String wayBillId
    ) {
        throw new RuntimeException("stub");
    }

    @Data
    @ApiModel(value = "保存过磅信息 请求")
    public static class WeighingRequest {
        @ApiModelProperty(value = "过磅重量")
        private double weight = 0.0D;
        @ApiModelProperty(value = "在途运单id")
        private String wayBillId;
        @ApiModelProperty(value = "过磅类型", allowableValues = "装前,装后,卸前,卸后")
        private String type;
    }

    @PatchMapping(value = apiPath + "/{wayBillId}/weighing")
    @ApiOperation(value = "保存过磅信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<ConsignmentBill> weighing(
            @RequestBody WeighingRequest request
    ) {
        /**
         * 涉及表格 `电子运单表` ?
         */
        throw new RuntimeException("stub");
    }

    @PostMapping(value = apiPath + "/{wayBillId}/wdcyxx")
    @ApiOperation(value = "保存外地承运信息 wdcyxx==外地承运信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<ConsignmentBill> saveWdcyxx(
            @RequestBody WdcyxxTab request
    ) {
        /**
         * 涉及表格 `外地承运信息备案表`
         */
        throw new RuntimeException("stub");
    }

    @Data
    @ApiModel(value = "保存人员验证结果 请求")
    public static class StaffCheckRequest {
        @ApiModelProperty(value = "驾驶员eid")
        private String jsyEid;
        @ApiModelProperty(value = "押运员eid")
        private String yyyEid;
        @ApiModelProperty(value = "装货管理员eid")
        private String zhglyEid;
    }

    @PostMapping(value = apiPath + "/{wayBillId}/staffCheck")
    @ApiOperation(value = "保存人员验证结果（装货前检查验证驾押人员、装货管理员）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<ConsignmentBill> staffCheck(
            @RequestBody StaffCheckRequest request
    ) {
        /**
         * 涉及表格 `电子运单表` 驾驶员eid 押运员eid
         */
        throw new RuntimeException("stub");
    }

    @GetMapping(value = apiPath + "/{wayBillId}/security/check")
    @ApiOperation(value = "查询装卸货安全检查项（前、后）（可复用常用设置里的接口））")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<List<TOperatingProcedures>> securityCheck(
            @ApiParam(allowEmptyValue = false, value = "在途运单id")
            @RequestParam(value = "wayBillId") String wayBillId
    ) {
        /**
         * 表格 `危险货物装卸操作规程表`
         */
        throw new RuntimeException("stub");
    }

    @PostMapping(value = apiPath + "/{wayBillId}/security/check")
    @ApiOperation(value = "保存装卸货安全检查项")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<String> securityCheck(
            @ApiParam(allowEmptyValue = false, value = "通过检查项的id数组")
            @RequestBody Set<Integer> checkedIdSet
    ) {
        throw new RuntimeException("stub");
    }

    @PostMapping(value = apiPath + "/{wayBillId}/load/start")
    @ApiOperation(value = "开始装货（修改状态，装货中）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<String> loadStart() {
        /**
         * 表格 `检查设置项` 中的ownerId 指的是 托运单表的id呢 还是 危化企业的id呢 还是其他的呢 ?
         */
        throw new RuntimeException("stub");
    }

    @PostMapping(value = apiPath + "/{wayBillId}/load/finish")
    @ApiOperation(value = "装货完成（跳转装货后检查）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<String> loadFinish() {
        /**
         * 表格 `检查设置项` 中的ownerId 指的是 托运单表的id呢 还是 危化企业的id呢 还是其他的呢 ?
         */
        throw new RuntimeException("stub");
    }

    @ApiModel(value = "装卸货出入厂 请求")
    public static class StatusManualChangeRequest {
        @ApiModelProperty(value = "是否装货")
        private boolean load;
        @ApiModelProperty(value = "是否入场")
        private boolean in;
    }

    @PostMapping(value = apiPath + "/{wayBillId}/status/manual")
    @ApiOperation(value = "装卸货入厂（修改状态：装货入场、卸货入厂）; 装卸货出厂（修改状态：运输中、已出厂）; 场景:本地运输企业,外地危化企业")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<String> manual() {
        throw new RuntimeException("stub");
    }


}
