package com.weis.common.rabbitMq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class RabbitMQProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.queue}")
    private String queueName;

    public void sendMessage(String routingKey, String message) {
        log.info("sendmsg");
        rabbitTemplate.convertAndSend(message);

    }

    public void sendMessage(String exchange, String routingKey, String message) throws InterruptedException {
        log.info("exchange is: {}, routingKey is: {}, message is: {}", exchange, routingKey, message);
        rabbitTemplate.convertAndSend(exchange, routingKey, message, new CorrelationData(UUID.randomUUID().toString()));
        TimeUnit.SECONDS.sleep(1L);
    }

}
