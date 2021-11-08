package com.weis.controller;

import com.weis.service.ATestServiceI;
import com.weis.service.BTestServiceI;
import com.weis.service.interfacel.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ServiceTestController
 * @Description TODO
 * @Author weis
 * @Date 2021/9/8 17:48
 * @Version
 */
@RestController
@RequestMapping("/test")
public class ServiceTestController {

    @Autowired
    @Qualifier(value = "bTestServiceI")
    TestService testService;

    @GetMapping("/test1")
    public String test1(){
        return testService.fun1();
    }

    @GetMapping("/test2")
    public String test2(){
        return testService.fun2();
    }

}
