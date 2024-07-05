# Project REST Web Service Store with Spring Boot and JPA / Hibernate

<div style="text-align: center">
  <img src="/src/assets/imgs/spring.png" alt="Spring Boot" width="500px;">
</div>

## General Objective

- Develop a store project using the frameworks Spring Boot and Hibernate.
- Know the main features of Spring Boot and JPA / Hibernate in practice.
- Implement basic [CRUD](https://www.codecademy.com/article/what-is-crud) operations (CREATE, READ, UPDATE, DELETE).
- Structure [Logical Layers](https://medium.com/twodigits/java-microservice-layer-architecture-3874a9a6c611): resource,
  service, repository, etc.

## Technologies Used

### JPA / Hibernate

- Java Persistence API (JPA) is the Java EE platform standard specification (`javax.persistence` package) for
  object-relational mapping and data persistence.
- To work with JPA it is necessary to include an API implementation in the project (Hibernate).

### Spring Framework

- Java Spring Boot (Spring Boot) is a tool that makes developing web applications and microservices with the Spring
  Framework easier and faster through three key features:

    1. Autoconfiguration.

    2. An opinionated approach to configuration.

    3. The ability to create standalone applications.

### H2 Database

- H2 is a relational database management system written in Java. It can be embedded in Java applications or run in
  client-server mode.

## Project Overview

### Logical Layers Explanation

<img src="/src/assets/imgs/logical-layers.png" alt="Microservice Layers" style="width: 650px;">

#### Resource Layer

- The resource layer is only responsible for the interface, it defines the URLs for the endpoints and secures the
  application. In addition, it forwards requests to the underlying layer, the service layer.

#### Service Layer

- The service layer contains the core logic of the system. All algorithms and data processing are performed in this
  layer. Data required processes are queried from the layer below, the data access layer.

#### Data Access Layer (Data Repositories)

- The data access layer has four tasks: creating, reading, updating and deleting data (CRUD). To hide and unify access
  to the data sources from service layer, this layer implements a interface for the data from all data sources.

#### Entities

- Entity is a lightweight persistence domain object.

#### Config Package

- Config Package indicates @Bean methods and processed by the Java container to generate bean definitions and service
  requests for those beans at runtime.

### Another Layer Architecture

<img src="/src/assets/imgs/microservice-layers.png" alt="Microservice Layers" style="width: 700px;">

### Domain Model

<img src="/src/assets/imgs/domain-model.png" alt="Domain Model" style="width: 750px;">

### Domain Instance

<img src="/src/assets/imgs/domain-instance.png" alt="Domain Instance" style="width: 750px;">

## Versions

- Java 17
- Spring Boot 3.0.0

## Installations of the tools

- [Spring Tools 4](https://spring.io/tools)
- [Postman API](https://www.postman.com)