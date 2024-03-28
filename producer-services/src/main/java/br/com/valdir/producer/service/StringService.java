package br.com.valdir.producer.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static br.com.valdir.producer.config.RabbitMQConfig.EXCG_NAME_MARKETPLACE;
import static br.com.valdir.producer.config.RabbitMQConfig.RK_PRODUCT_LOG;

@RequiredArgsConstructor
@Service
@Slf4j
public class StringService {

    private final RabbitTemplate rabbitTemplate;

    public void produce(String message){
        log.info("Received message: " + message);
        rabbitTemplate.convertAndSend(EXCG_NAME_MARKETPLACE, RK_PRODUCT_LOG, message);
    }
}
