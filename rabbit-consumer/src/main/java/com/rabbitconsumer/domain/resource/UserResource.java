package com.rabbitconsumer.domain.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResource {
    private String name;

    private String mail;

    private String age;

    private String zipCode;
}
