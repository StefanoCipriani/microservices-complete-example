package com.complete.microservices.microservice1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private  Logger logger = LoggerFactory.getLogger(this.getClass()); 

	@Autowired
	private Configuration configuration;
	
	@Autowired
	private Environment env;
	
	@GetMapping("hello")
    public ResponseEntity<HelloConfiguration> getHello(){
		logger.info("{}","Microcontroller1 hello");
        return new ResponseEntity<HelloConfiguration>(
        		new HelloConfiguration(configuration.getMessage(), configuration.getDescription(), env.getProperty("local.server.port")),
        		HttpStatus.OK);
    }  

}