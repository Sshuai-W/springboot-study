package com.weis.common;

/**
 * @ClassName RequestEnum
 * @Description TODO
 * @Author weis
 * @Date 2021/9/10 10:39
 * @Version
 */
public enum RequestEnum {
    REQUEST_SUCCESS(200,"成功"),
    REQUEST_ERROR_DEFAULT(501,"操作失败");

    private Integer code;

    private String message;

    RequestEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
