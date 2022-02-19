package com.rabbitconsumer.service.converter;

import com.rabbitconsumer.domain.Address;
import com.rabbitconsumer.domain.User;
import com.rabbitconsumer.domain.resource.UserResource;

public class UserConverter {

    public static User converter(UserResource userResource) {
        Address address = Address.builder().zipCode(userResource.getZipCode()).build();
        return User.builder()
                .name(userResource.getName())
                .mail(userResource.getMail())
                .age(userResource.getAge())
                .address(address)
                .build();

    }
}
