package br.com.valdir.producer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String EXCG_NAME_MARKETPLACE = "marketplace.direct";
    public static final String QUEU_NAME_PRODUCT_LOG = "product.log";
    public static final String RK_PRODUCT_LOG = "product.log";

    @Bean
    public Queue queue(){
        return new Queue(QUEU_NAME_PRODUCT_LOG, false, false, false);
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(EXCG_NAME_MARKETPLACE, false, false);
    }

    @Bean
    public Binding binding(){
        return  BindingBuilder
                .bind(queue())
                .to(directExchange())
                .with(RK_PRODUCT_LOG);
    }
}
