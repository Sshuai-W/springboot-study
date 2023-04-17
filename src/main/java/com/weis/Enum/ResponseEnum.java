package com.weis.Enum;

/**
 * @ClassName RequestEnum
 * @Description TODO
 * @Author weis
 * @Date 2021/9/10 10:39
 * @Version
 */
public enum ResponseEnum {
    REQUEST_SUCCESS(200,"成功"),
    REQUEST_ERROR_DEFAULT(501,"操作失败"),
    EXCEPTION(502,"出现异常"),
    NOT_FOUND(503,"未找到结果"),
    BALANCE_NOT_ENOUGH(504,"余额不足");

    private Integer code;

    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
