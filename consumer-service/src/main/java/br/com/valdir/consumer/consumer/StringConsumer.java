package br.com.valdir.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StringConsumer {

   @RabbitListener(queues = {"product.log"})
    public void consumer(String message){
       log.info("Consumer: " + message);
    }
}
