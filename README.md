# microservices-complete-example

## Microservices components overview

## Configuration server
A microservice search by default a configuration server on port 8888
Enabled by @EnableConfigServer annotation on main class
It has a linked git repsitory specified by follow prop:
spring.cloud.config.server.git.uri=file:///C:/Users/stefano.cipriani/git/git-localconfig-repo

## Feign
Makes simple communication within microservices without using RestTemplate
there is Ribbon who locate the service and feign that handle the data transfer between the calle rand the colled
## Ribbon
Is a load balancer that allow to balance the request among the different running instances of a specific microservice
## Naming server
It is aservice that contain all the running instances of diffrents microservices.
Ribbon ask to him when need of a particular microservice.
	
	
## Project description
In our example there are:
* microservice-0:
	running on port 9000 has ribbon/feign configured and calls microservice-1 
* microservice-1:
	simple microservice exposing some rest
* microservice-2:
	simple microservice exposing some rest
* microservice-naming-server:
	eureka server that contains all microservices running instances
* spring-cloud-config-server:
	provides configuration properties for all the microservices above. 
	It as priority against application.properties file of specific microservice
