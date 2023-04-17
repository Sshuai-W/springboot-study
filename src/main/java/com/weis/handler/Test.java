package com.weis.handler;

import java.lang.reflect.Proxy;

/**
 * @ClassName Test
 * @Description TODO
 * @Author weis
 * @Date 2022/8/3 11:53
 * @Version
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),RealSubject.class.getInterfaces(),new MyInvocationHandler(new RealSubject()));
        subject.doSomething();
    }

}
