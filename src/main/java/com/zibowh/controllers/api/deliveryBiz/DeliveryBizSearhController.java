package com.zibowh.controllers.api.deliveryBiz;

import com.github.pagehelper.PageInfo;
import com.zibowh.controllers.api.APIController;
import com.zibowh.controllers.response.BaseResponse;
import com.zibowh.controllers.response.payload.BizBill;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DeliveryBizSearhController extends APIController {

    @GetMapping(value = apiPath + "delivery_biz/find/{id}")
    @ApiOperation(value = "运单详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header")
    })
    public BaseResponse<BizBill> detail(
            @PathVariable(value = "id") String id,
            HttpServletRequest request
    ) {
        throw new RuntimeException("stub");
    }

    @GetMapping(value = apiPath + "delivery_biz/search")
    @ApiOperation(value = "运单详情")
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


}
