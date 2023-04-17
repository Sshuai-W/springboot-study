package com.weis.aspect;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName LogApp
 * @Description TODO
 * @Author weis
 * @Date 2022/8/1 11:41
 * @Version
 */
@Slf4j
@Aspect
@Component
public class LogApp {

    @Pointcut("execution(public * com.weis.controller.*.*(..))")
    public void pointCut(){};

    @Pointcut("@annotation(com.weis.annotations.aop.LogAnnotations)")
    public void annotationsPointCut(){};

    @Before("annotationsPointCut()")
    public void before(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.info("请求IP为: " + request.getRemoteAddr());
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        log.info("invoke: " + method.getName() + "......");
        log.info("请求参数为: " + JSON.toJSONString(joinPoint.getArgs()));
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("around advice:{}" + Arrays.toString(joinPoint.getArgs()));
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Object proceed = joinPoint.proceed();
        log.info("返回值为: " + JSON.toJSONString(proceed));
        return proceed;
    }

    @AfterReturning(value = "annotationsPointCut()", returning = "res")
    public void afterReturning(JoinPoint joinPoint, Object res){
        log.info("返回值为: " + JSON.toJSONString(res));
    }
}
