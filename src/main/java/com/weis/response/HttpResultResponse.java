package com.weis.response;

import com.weis.common.RequestEnum;

/**
 * @ClassName HttpResultResponse
 * @Description TODO
 * @Author weis
 * @Date 2021/9/10 15:10
 * @Version
 */
public class HttpResultResponse<T> {

    private Integer code;

    private String message;

    private T data;

    private HttpResultResponse() {
    }

    private HttpResultResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private static <T> HttpResultResponse<T> getInstance(RequestEnum requestEnum, T data) {
        return new HttpResultResponse<T>(requestEnum.getCode(), requestEnum.getMessage(), data);
    }

    public static <T> HttpResultResponse<T> success(){
        return getInstance(RequestEnum.REQUEST_SUCCESS,null);
    }

    public static <T> HttpResultResponse<T> success(T data) {
        return getInstance(RequestEnum.REQUEST_SUCCESS, data);
    }

    public static <T> HttpResultResponse<T> error(){
        return getInstance(RequestEnum.REQUEST_ERROR_DEFAULT,null);
    }

    public static <T> HttpResultResponse<T> error(T data){
        return getInstance(RequestEnum.REQUEST_ERROR_DEFAULT,data);
    }

    public static <T> HttpResultResponse<T> error(RequestEnum requestEnum,T data){
        return getInstance(requestEnum,data);
    }


}
