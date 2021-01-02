# Java Microservice POC

This is a POC project for basic Microservice architecture. This impliments a basic level of end-to-end miscroservice enviroment along with *discovery-server, api-gateway* & *microservices*.

* Keeping the document as minimal as possible and on a very high-level.

## Architecture
This application exposes API endpoints and JSON data are exchanded with HTTP requests. There are majorly three components in the whole HTTP request lifecycle.

 - Netflix Eureka Discovery server
 - Netflix Zuul server (API Gateway)
 - RESTful Microservices

## Tech Stack
Athe the time of the build I have used the bellow technologies
|Technology|Version  |
|--|--|
| JDK | 11 |
| Spring Boot | 2.3.8 |

### Dependencies Used in Spring Boot

 * jersey
 * web
 * web-services
 * netflix-eureka-client 
 * netflix-eureka-server - Only required for Discovery client service
 * netflix-hystrix
 * netflix-ribbon
 * netflix-zuul - Only required for Zuul Gateway
