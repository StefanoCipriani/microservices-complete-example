package com.complete.microservices.microservicenamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaNamingServerApplication.class, args);
	}

}
