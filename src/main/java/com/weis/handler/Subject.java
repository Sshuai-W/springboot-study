package com.weis.handler;

import com.weis.annotations.aop.LogAnnotations;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author weis
 * @Date 2022/8/3 11:51
 * @Version
 */
public interface Subject {

    @LogAnnotations
    void doSomething();

}
