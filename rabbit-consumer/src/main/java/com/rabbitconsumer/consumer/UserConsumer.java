package com.rabbitconsumer.consumer;

import com.rabbitconsumer.RabbitConsumerApplication;
import com.rabbitconsumer.domain.resource.UserResource;
import com.rabbitconsumer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @Autowired
    private UserService userService;

    Logger logger = LoggerFactory.getLogger(RabbitConsumerApplication.class);

    @RabbitListener(queues = {"${queue.user.name}"})
    public void receive(@Payload UserResource userResource) {
        logger.info("Message Received: " + userResource.toString());
        userService.create(userResource);
    }

}
