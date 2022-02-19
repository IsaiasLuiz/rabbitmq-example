package com.rabbitproducer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderUserConfig {

    @Value("${queue.user.name}")
    private String userQueue;

    @Value("${spring.rabbitmq.host}")
    private String host;

    @Bean
    public CachingConnectionFactory connectionFactory() {
        return new CachingConnectionFactory(host);
    }

    @Bean
    public Queue queue() {
        return new Queue(userQueue, true);
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        return rabbitTemplate;
    }
}
