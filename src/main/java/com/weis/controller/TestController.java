package com.weis.controller;

import com.weis.common.rabbitMq.RabbitMQProducer;
import com.weis.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author weis
 * @Date 2022/5/23 22:03
 * @Version
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @PostMapping("/test1")
    public void test1(@RequestBody TestDto testDto){
        TestDto testDto1 = testDto;
        System.out.println(testDto1);
    }

    @PostMapping("/test2")
    public void test2(@RequestBody Map<String,String> map) throws InterruptedException {
        String exchange = map.get("exchange");
        String routingKey = map.get("routingKey");
        String message = map.get("message");
        rabbitMQProducer.sendMessage(exchange,routingKey,message);
    }

}
