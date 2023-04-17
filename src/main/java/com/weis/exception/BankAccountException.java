package com.weis.exception;

import com.weis.Enum.ResponseEnum;

/**
 * @ClassName BankAccountException
 * @Description TODO
 * @Author weis
 * @Date 2022/8/8 11:41
 * @Version
 */
public class BankAccountException extends RuntimeException{

    private ResponseEnum responseEnum;

    public BankAccountException(ResponseEnum responseEnum,String message) {
        super(message);
        this.responseEnum = responseEnum;
    }

    public ResponseEnum getResponse(){
        return responseEnum;
    }
}
