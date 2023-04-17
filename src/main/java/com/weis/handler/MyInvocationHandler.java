package com.weis.handler;

import com.weis.annotations.aop.LogAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHandler
 * @Description TODO
 * @Author weis
 * @Date 2022/8/3 11:49
 * @Version
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Annotation annotation = method.getAnnotation(LogAnnotations.class);
        if (annotation != null){
            System.out.println("before doSomething");
        }
        method.invoke(object,args);
        return proxy;
    }
}
