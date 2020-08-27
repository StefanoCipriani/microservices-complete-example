package com.complete.microservices.microservice0.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.complete.microservices.microservice0.beans.model.HelloConfiguration;

@RibbonClient(name ="microservice-2")
@FeignClient(contextId = "ms2FeignClient", name ="microservice-zuul")
public interface FeignProxyMs2 {

	@GetMapping("microservice-2/hello")//using zuul we must append the application name
	public ResponseEntity<HelloConfiguration> callMicroservice2Feign();
}
