package com.weis.service;

import com.weis.service.interfacel.TestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName ATestServiceI
 * @Description TODO
 * @Author weis
 * @Date 2021/9/8 17:54
 * @Version
 */

@Service("aTestServiceI")
public class ATestServiceI implements TestService {

    @Override
    public String fun1() {
        return "ATestServiceI";
    }



}
