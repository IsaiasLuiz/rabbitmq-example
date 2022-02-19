package com.rabbitconsumer.service.converter;

import com.rabbitconsumer.domain.Address;
import com.rabbitconsumer.domain.resource.AddressResource;

public class AddressConverter {
    public static Address converter(AddressResource addressResource) {
        return Address.builder()
                .zipCode(addressResource.getZipCode())
                .street(addressResource.getStreet())
                .district(addressResource.getDistrict())
                .city(addressResource.getCity())
                .state(addressResource.getState())
                .build();
    }
}