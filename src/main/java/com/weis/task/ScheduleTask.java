package com.weis.task;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @ClassName ScheduleTask
 * @Description TODO
 * @Author weis
 * @Date 2022/8/1 17:23
 * @Version
 */
@Component
@EnableScheduling
@EnableAsync
@ConditionalOnProperty(prefix = "spring",
        name = "task",
        havingValue = "true")
public class ScheduleTask {

    @Scheduled(cron = "0/5 * * * * ?")
    private void demo1(){
        System.out.println("执行定时任务: " + LocalDateTime.now());
    }


}
