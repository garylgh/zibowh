package com.zibowh.controllers.api;

import com.zibowh.constants.ErrorConstants;
import com.zibowh.contracts.authenticate.UserContract;
import com.zibowh.controllers.response.BaseResponse;
import com.zibowh.exceptions.BaseException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract public class APIController {

    public static final String apiBasePath = "/api/v1/";

    public static final String tokenHeader = "Authorization";

    public static final String tokenStarts = "Bearer ";

    @ExceptionHandler
    public BaseResponse exceptionHandler(Throwable e, HttpServletRequest request, HttpServletResponse response) {
        if (e instanceof BaseException) {
            return BaseResponse.build(((BaseException) e).getErrorConstant());
        }
        return BaseResponse.build(ErrorConstants.Errors.FAIL);
    }

    protected UserContract auth(HttpServletRequest request) {
        throw new RuntimeException("stub");
    }

    protected <U extends UserContract> UserContract auth(HttpServletRequest request, Class<U> clazz) {
        throw new RuntimeException("stub");
    }
}
