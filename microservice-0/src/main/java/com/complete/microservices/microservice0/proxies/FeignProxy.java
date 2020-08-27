package com.complete.microservices.microservice0.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.complete.microservices.microservice0.beans.model.HelloConfiguration;

//@FeignClient(name ="microservice-1", url="localhost:9001" ) //configuration without ribbon
@RibbonClient(name ="microservice-1")
//@FeignClient(name ="microservice-1") //configuration without using zuul api gateway
@FeignClient(contextId = "ms1FeignClient",name ="microservice-zuul")
public interface FeignProxy {

	//@GetMapping("hello")//The name of rest of destination microservice
	@GetMapping("microservice-1/hello")//using zuul we must append the application name
	public ResponseEntity<HelloConfiguration> callMicroservice1Feign();
}
