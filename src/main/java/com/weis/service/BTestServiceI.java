package com.weis.service;

import com.weis.service.interfacel.TestService;
import org.springframework.stereotype.Service;

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
}
