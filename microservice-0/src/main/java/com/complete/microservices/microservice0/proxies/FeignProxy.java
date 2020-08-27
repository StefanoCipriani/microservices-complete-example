package com.complete.microservices.microservice0.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.complete.microservices.microservice0.beans.model.HelloConfiguration;

//@FeignClient(name ="microservice-1", url="localhost:9001" ) //configuration without ribbon
@RibbonClient(name ="microservice-1")
@FeignClient(name ="microservice-1")
public interface FeignProxy {

	@GetMapping("hello")//The name of rest of destination microservice
	public ResponseEntity<HelloConfiguration> callMicroservice1Feign();
}
