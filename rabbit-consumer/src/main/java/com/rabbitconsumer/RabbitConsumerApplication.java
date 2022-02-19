package com.rabbitconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RabbitConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitConsumerApplication.class, args);
	}

}
