package com.complete.microservices.microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complete.microservices.microservice1.beans.model.HelloConfiguration;
import com.complete.microservices.microservice1.configurations.Configuration;

@RestController
public class MicroController1 {

	@Autowired
	private Configuration configuration;
	
	@Autowired
	private Environment env;
	
	@GetMapping("hello")
    public ResponseEntity<HelloConfiguration> getHello(){
        return new ResponseEntity<HelloConfiguration>(
        		new HelloConfiguration(configuration.getMessage(), configuration.getDescription(), env.getProperty("local.server.port")),
        		HttpStatus.OK);
    }  

}