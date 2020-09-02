CircleCI [![CircleCI](https://circleci.com/gh/mariamihai/udemy-sbm-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/mariamihai/udemy-sbm-beer-inventory-service)

Docker [![Docker](https://img.shields.io/docker/v/mariamihai/sbm-beer-inventory-service?sort=semver)](https://img.shields.io/docker/v/mariamihai/sbm-beer-inventory-service?sort=semver)

# SBM Beer Inventory Service
Spring Boot Microservice project

## Description
The current project encapsulates the beer inventory part of initial [monolith brewery project](https://github.com/mariamihai/udemy-sbm-brewery-monolith).
The initial project was split in 3 microservices:
* [SBM (Spring Boot Microservices) Beer Service](https://github.com/mariamihai/udemy-sbm-beer-service)
* [SBM (Spring Boot Microservices) Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service)
* SBM (Spring Boot Microservices) Beer Inventory Service [current project]

Overview of the project [here](https://github.com/mariamihai/udemy-sbm-overview).

## API Version
Currently the application is at _v1_.

## Implementation Details
### Properties
```
spring.application.name=beer-inventory-service

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