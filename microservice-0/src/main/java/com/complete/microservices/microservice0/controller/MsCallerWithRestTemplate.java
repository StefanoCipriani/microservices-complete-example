package com.complete.microservices.microservice0.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.complete.microservices.microservice0.beans.model.HelloConfiguration;

@RestController
public class MsCallerWithRestTemplate {
	
	@GetMapping("call-ms-1-rest-template")
	public ResponseEntity<HelloConfiguration> callMicroservice1RestTemplate(){
		
		ResponseEntity<HelloConfiguration> forEntity = new RestTemplate().getForEntity("http://localhost:9001/hello", HelloConfiguration.class);
        return forEntity;
    }
}
