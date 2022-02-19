package com.rabbitproducer.controller;

import com.rabbitproducer.domain.resource.UserResource;
import com.rabbitproducer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void create(@RequestBody UserResource user) {
         service.create(user);
    }
}
