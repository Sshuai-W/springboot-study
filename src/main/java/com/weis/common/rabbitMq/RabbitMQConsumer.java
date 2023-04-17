package com.weis.common.rabbitMq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMQConsumer {

//    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receiveMessage(String message) {
        log.info("Received message: " + message);
    }

//    @RabbitListener(queues = "test2")
    public void receiveMessageTest2(String message) {
        log.info("Received message2: " + message);
    }

}
