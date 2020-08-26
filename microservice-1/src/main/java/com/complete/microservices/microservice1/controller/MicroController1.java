package com.microservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController1 {

	@GetMapping("microservice-1-hello")
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<String>("Ciao da microservice-1", HttpStatus.OK);
    }

}