package com.weis.handler;

import com.weis.annotations.aop.LogAnnotations;

/**
 * @ClassName RealSubject
 * @Description TODO
 * @Author weis
 * @Date 2022/8/3 11:51
 * @Version
 */
public class RealSubject implements Subject{
    @Override
    @LogAnnotations
    public void doSomething() {
        System.out.println("doSomething");
    }
}
