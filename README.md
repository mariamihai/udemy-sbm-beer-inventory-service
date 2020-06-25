[![CircleCI](https://circleci.com/gh/mariamihai/udemy-sbm-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/mariamihai/udemy-sbm-beer-inventory-service)

# SBM Beer Inventory Service
Spring Boot Microservice project

## Description
The current project encapsulates the beer inventory part of initial [monolith brewery project](https://github.com/mariamihai/udemy-sbm-brewery-monolith).
The initial project was split in 3 microservices:
* [SBM (Spring Boot Microservices) Beer Service](https://github.com/mariamihai/udemy-sbm-beer-service)
* [SBM (Spring Boot Microservices) Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service)
* SBM (Spring Boot Microservices) Beer Inventory Service [current project]

## Implementation Details
### Default port mapping - for single host

| Service Name | Port | 
| --------| -----|
| [SBM Beer Service](https://github.com/mariamihai/udemy-sbm-beer-service) | 8080 |
| [SBM  Beer Order Service](https://github.com/mariamihai/udemy-sbm-beer-order-service) | 8081 |
| SBM Beer Inventory Service [current project] | 8082 |