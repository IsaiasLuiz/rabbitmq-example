package com.rabbitconsumer.service.http;

import com.rabbitconsumer.domain.resource.AddressResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "addressHttp", url = "https://viacep.com.br/")
public interface AddressHttp {

    @RequestMapping(method = RequestMethod.GET, value = "/ws/{zipCode}/json", produces = "application/json")
    AddressResource getAddressBy(@PathVariable("zipCode") String zipCode);
}
