[![CircleCI](https://circleci.com/gh/mariamihai/udemy-sbm-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/mariamihai/udemy-sbm-beer-inventory-service)
[![Docker](https://img.shields.io/docker/v/mariamihai/sbm-beer-inventory-service?sort=date)](https://hub.docker.com/r/mariamihai/sbm-beer-inventory-service)

# SBM Beer Inventory Service
Spring Boot Microservice project

  - [Description](#description)
  - [API version](#api-version)
  - [Docker images](#docker-images)
  - [Implementation details](#implementation-details)
    - [Properties](#properties)
    - [API calls](#api-calls)
      - [Get existing inventory for a specific beer](#get-existing-inventory-for-a-specific-beer)
      - [Get all existing inventory](#get-all-existing-inventory)

## Description
The current project is part of the "Spring Boot Microservices with Spring Cloud" [Udemy course](https://www.udemy.com/course/spring-boot-microservices-with-spring-cloud-beginner-to-guru/). 

The project adds to the inventory the beers brewed by the [Beer Service](https://github.com/mariamihai/udemy-sbm-beer-service) 
and validates the allocation of inventory to an order created by the [Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service) 
It removes the allocated inventory and inserts back inventory from cancelled orders.

An overview of all the projects involved can be found [here](https://github.com/mariamihai/udemy-sbm-overview).

## API version
_V1_ is the current implementation. No changes to the project are expected to be made in the future that will affect 
the existing endpoints.

## Docker images
Automatic building was not implemented for this project. The `latest` tag contains the best implementation considered 
appropriate to be used.

For automatic building of Docker images check the next projects:
- for [CircleCI](https://github.com/mariamihai/CIToDockerExampleProject)
- for [TravisCI](https://github.com/mariamihai/sma-overview) (all projects implemented under the "Spring Microservices in Action" book)

## Implementation details
### Properties
- the name of the application, used by Eureka and the other services 
```
spring.application.name=beer-inventory-service
```
- application server port
```
server.port=8082
```

### API calls
#### Get existing inventory for a specific beer
* __URI:__ _/api/v1/beer/:beerId/inventory_

 * __Method:__ _GET_

 * __URL params:__ <br/>
    * required: <br/>
        beerId=[uuid]
    * optional: -
    
 * __Success response:__
    * Code: 200 <br/>
    * Content: (TODO - response will be added)
    
       ``` 
       
       ```

#### Get all existing inventory
* __URI:__ _/api/v1/allinventory_

 * __Method:__ _GET_

 * __URL params:__ <br/>
    * required: - <br/>
    * optional: -
    
 * __Success response:__
    * Code: 200 <br/>
    * Content: (TODO - response will be added)
    
       ``` 
       
       ```