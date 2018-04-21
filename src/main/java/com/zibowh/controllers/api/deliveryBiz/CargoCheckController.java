package com.zibowh.controllers.api.deliveryBiz;

import com.github.pagehelper.PageInfo;
import com.zibowh.controllers.api.APIController;
import com.zibowh.controllers.response.BaseResponse;
import com.zibowh.controllers.response.payload.ConsignmentBill;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoCheckController extends APIController {

    @GetMapping(value = apiPath + "cargo_check/in_place/{id}")
    @ApiOperation(value = "获取当前已经进场的订单信息 消费者:危化企业app")
    @ApiImplicitParams({
            @ApiImplicitParam(name = tokenHeader, defaultValue = tokenStarts, value = "access_token", dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = "page", defaultValue = "0", value = "分页页码数,从0开始", dataType = "integer", paramType = "query"),
            @ApiImplicitParam(name = "size", defaultValue = "200", value = "每页条数", dataType = "integer", paramType = "query")
    })
    public BaseResponse<PageInfo<ConsignmentBill>> currentInPlace(
            @ApiParam(allowEmptyValue = true, value = "危化企业id")
            @PathVariable(value = "id") String id,
            @PageableDefault Pageable pageable
    ) {
        throw new RuntimeException("stub");
    }


}
