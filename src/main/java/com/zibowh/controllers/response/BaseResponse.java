package com.zibowh.controllers.response;

import com.zibowh.constants.ErrorConstants.Errors;
import org.springframework.http.HttpStatus;

/**
 * 订单返回结果
 * 
 * @author ghlin
 * @since 2018-04-15
 */
public class BaseResponse<T> {

    private Integer code;

    private String msg;

    private Integer httpStatus;

    private T data;

    private BaseResponse() {}

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 创建响应体，成功返回，设置返回的数据
     * 
     * @param data
     * @return 响应体
     */
    public static <E> BaseResponse<E> build(E data) {
        return build(HttpStatus.OK.value(), Errors.SUCCESS, data);
    }

    /**
     * 创建响应体，成功返回，设置返回的数据，单独设置http状态码
     * 
     * @param httpStatus HTTP状态码
     * @param data
     * @return 响应体
     */
    public static <E> BaseResponse<E> build(int httpStatus, E data) {
        return build(httpStatus, Errors.SUCCESS, data);
    }

    /**
     * 创建响应体，有错误，但http状态仍是HttpStatus.OK
     * 
     * @param error 错误信息
     * @return 响应体
     */
    public static <E> BaseResponse<E> build(Errors error) {
        return build(HttpStatus.OK.value(), error, null);
    }

    /**
     * 创建响应体，有错误，单独设置http状态码
     * 
     * @param httpStatus HTTP状态码
     * @param error 错误信息
     * @return 响应体
     */
    public static <E> BaseResponse<E> build(int httpStatus, Errors error) {
        return build(httpStatus, error, null);
    }

    /**
     * 创建响应体。
     * 
     * @param httpStatus HTTP状态码
     * @param error 错误信息
     * @param data 返回的数据
     * @return 响应体
     */
    public static <E> BaseResponse<E> build(int httpStatus, Errors error, E data) {
        BaseResponse<E> response = new BaseResponse<>();
        response.data = data;
        response.httpStatus = httpStatus;
        response.code = error.getCode();
        response.msg = error.getMessage();
        return response;
    }
}
