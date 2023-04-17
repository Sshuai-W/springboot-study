package com.weis.exception;

import com.weis.Enum.ResponseEnum;
import com.weis.response.HttpResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName MyExceptionHandler
 * @Description TODO
 * @Author weis
 * @Date 2022/4/25 9:49
 * @Version
 */
@Slf4j
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler
    public HttpResultResponse<Void> exceptionHandler(RuntimeException e){
        log.error("出现异常",e);
        return HttpResultResponse.error(ResponseEnum.EXCEPTION,null);
    }

    @ExceptionHandler
    public HttpResultResponse<Void> bankAccountExceptionHandler(BankAccountException e){
        log.error("转账出现异常",e);
        return HttpResultResponse.error(e.getResponse(),null);
    }

}
