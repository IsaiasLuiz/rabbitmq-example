package com.rabbitconsumer.service;

import com.rabbitconsumer.RabbitConsumerApplication;
import com.rabbitconsumer.domain.Address;
import com.rabbitconsumer.domain.User;
import com.rabbitconsumer.domain.resource.AddressResource;
import com.rabbitconsumer.domain.resource.UserResource;
import com.rabbitconsumer.repository.UserRepository;
import com.rabbitconsumer.service.converter.AddressConverter;
import com.rabbitconsumer.service.converter.UserConverter;
import com.rabbitconsumer.service.http.AddressHttp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private AddressHttp addressHttp;

    @Autowired
    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(RabbitConsumerApplication.class);

    public void create(UserResource userResource) {
        User user = UserConverter.converter(userResource);
        AddressResource addressResource = addressHttp.getAddressBy(user.getAddress().getZipCode());
        Address converter = AddressConverter.converter(addressResource);
        user.setAddress(converter);

        userRepository.save(user);
        logger.info("Data saved: " + user.toString());
    }
}
