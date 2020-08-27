package com.complete.microservices.microservicezuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceZuulApplication {

	private static Logger logger = LoggerFactory.getLogger(MicroserviceZuulApplication.class); 

	public static void main(String[] args) {
		logger.info("Starting ZUUL application");

		SpringApplication.run(MicroserviceZuulApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
