# microservices-complete-example

## Microservices components overview

## configuration server
	A microservice search by default a configuration server on port 8888
	Enabled by @EnableConfigServer annotation on main class
	It has a linked git repsitory specified by follow prop:
		### spring.cloud.config.server.git.uri=file:///C:/Users/stefano.cipriani/git/git-localconfig-repo

## feign
	Makes simple communication within microservices without using RestTemplate
## ribbon
	Is a load balancer that allow to balance the request among the different running instances of a specific microservice
## naming server
	It is aservice that contain all the running instances of diffrents microservices.
	Ribbon commincate with him
	
	
## Project description

	....TODO...