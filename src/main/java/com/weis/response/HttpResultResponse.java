package com.weis.response;

import com.weis.Enum.ResponseEnum;

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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private static <T> HttpResultResponse<T> getInstance(ResponseEnum ResponseEnum, T data) {
        return new HttpResultResponse<T>(ResponseEnum.getCode(), ResponseEnum.getMessage(), data);
    }

    public static <T> HttpResultResponse<T> success(){
        return getInstance(ResponseEnum.REQUEST_SUCCESS,null);
    }

    public static <T> HttpResultResponse<T> success(T data) {
        return getInstance(ResponseEnum.REQUEST_SUCCESS, data);
    }

    public static <T> HttpResultResponse<T> error(){
        return getInstance(ResponseEnum.REQUEST_ERROR_DEFAULT,null);
    }

    public static <T> HttpResultResponse<T> error(T data){
        return getInstance(ResponseEnum.REQUEST_ERROR_DEFAULT,data);
    }

    public static <T> HttpResultResponse<T> error(ResponseEnum ResponseEnum,T data){
        return getInstance(ResponseEnum,data);
    }


}
