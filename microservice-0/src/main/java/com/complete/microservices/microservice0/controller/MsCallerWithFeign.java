package com.complete.microservices.microservice0.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complete.microservices.microservice0.beans.model.HelloConfiguration;
import com.complete.microservices.microservice0.proxies.FeignProxy;
import com.complete.microservices.microservice0.proxies.FeignProxyMs2;

@RestController
public class MsCallerWithFeign {

	private  Logger logger = LoggerFactory.getLogger(this.getClass()); 

	@Autowired
	private FeignProxy proxy;
	
	@Autowired
	private FeignProxyMs2 proxyMs2;
	
	
	@GetMapping("call-ms-1-feign-ribbon")
	public ResponseEntity<HelloConfiguration> callMicroservice1Feign(){
		logger.info("{}","call-ms-1-feign-ribbon");
		return proxy.callMicroservice1Feign();
    }
	
	@GetMapping("call-ms-2-feign-ribbon")
	public ResponseEntity<HelloConfiguration> callMicroservice2Feign(){
		logger.info("{}","call-ms-2-feign-ribbon");
		return proxyMs2.callMicroservice2Feign();
    }
	
}
