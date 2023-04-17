package com.weis.service;

import com.weis.service.interfacel.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName BTestServiceI
 * @Description TODO
 * @Author weis
 * @Date 2021/9/8 17:55
 * @Version
 */
@Service("bTestServiceI")
public class BTestServiceI implements TestService {
    @Override
    public String fun1() {
        return "BTestServiceI";
    }

    @Override
    public String fun2() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8888/test/test1", String.class);
        String body = forEntity.getBody();
        return body;
    }
}
