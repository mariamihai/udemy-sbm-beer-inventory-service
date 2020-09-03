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
       [
           {
               "id": "53c1ba86-aefa-41a3-aa3d-e8924e57e782",
               "createdDate": "2020-09-03T12:20:47.316Z",
               "lastModifiedDate": "2020-09-03T12:39:08.187Z",
               "beerId": "357d11d2-ab0d-4bff-bfc2-05601afd0c6e",
               "quantityOnHand": 115
           }
       ]
       ```

#### Get all existing inventory
* __URI:__ _/api/v1/allinventory_

 * __Method:__ _GET_

 * __URL params:__ <br/>
    * required: - <br/>
    * optional: -
    
 * __Success response:__
    * Code: 200 <br/>
    * Content:
    
       ``` 
       [
           {
               "id": "53c1ba86-aefa-41a3-aa3d-e8924e57e782",
               "createdDate": "2020-09-03T12:20:47.316Z",
               "lastModifiedDate": "2020-09-03T12:37:56.185Z",
               "beerId": "357d11d2-ab0d-4bff-bfc2-05601afd0c6e",
               "quantityOnHand": 117
           },
           {
               "id": "7ca0a891-1051-46c6-b6e1-985a39f950b6",
               "createdDate": "2020-09-03T12:20:47.447Z",
               "lastModifiedDate": "2020-09-03T12:38:20.135Z",
               "beerId": "94d47759-9e0f-4ed5-bf75-caeda6206da5",
               "quantityOnHand": 122
           },
           {
               "id": "d580c531-fd5c-46f1-b206-6e4ffb8931f9",
               "createdDate": "2020-09-03T12:20:42.894Z",
               "lastModifiedDate": "2020-09-03T12:38:08.145Z",
               "beerId": "f5d5fa59-26f2-4c55-83df-e841c9fd9c22",
               "quantityOnHand": 114
           }
       ]
       ```