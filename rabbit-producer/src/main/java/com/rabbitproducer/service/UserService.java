package com.rabbitproducer.service;

import com.rabbitproducer.RabbitProducerApplication;
import com.rabbitproducer.domain.resource.UserResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    Logger logger = LoggerFactory.getLogger(RabbitProducerApplication.class);

    public void create(UserResource user) {
        rabbitTemplate.convertAndSend(this.queue.getName(), user);
        logger.info("Message produced: " + user.toString());
    }

}
