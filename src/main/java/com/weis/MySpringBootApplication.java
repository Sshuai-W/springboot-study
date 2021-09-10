package com.weis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MySpringBootApplication
 * @Description TODO
 * @Author weis
 * @Date 2021/9/8 17:46
 * @Version
 */
@SpringBootApplication
@MapperScan(value = "com.weis.dao")
public class MySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }

}
