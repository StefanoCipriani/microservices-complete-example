package com.complete.microservices.microservice0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.complete.microservices.microservice0")
@SpringBootApplication
public class Microservice0Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice0Application.class, args);
	}

}