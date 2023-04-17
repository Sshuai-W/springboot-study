package com.weis.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName ApplicationUntil
 * @Description TODO
 * @Author weis
 * @Date 2022/8/16 9:59
 * @Version
 */
@Component
public class ApplicationUntil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (ApplicationUntil.applicationContext == null){
            ApplicationUntil.applicationContext = applicationContext;
        }
    }

    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> tClass){
        return applicationContext.getBean(tClass);
    }

    public static <T> T getBean(String name, Class<T> tClass){
        return applicationContext.getBean(name,tClass);
    }

}
