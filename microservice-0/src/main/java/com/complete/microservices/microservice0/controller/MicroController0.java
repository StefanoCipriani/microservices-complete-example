package com.complete.microservices.microservice0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complete.microservices.microservice0.beans.model.HelloConfiguration;
import com.complete.microservices.microservice0.configurations.Configuration;

@RestController
public class MicroController0 {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("hello")
    public ResponseEntity<HelloConfiguration> getHello(){
        return new ResponseEntity<HelloConfiguration>(new HelloConfiguration(configuration.getMessage(), configuration.getDescription()), HttpStatus.OK);
    }

}