# E-commerce Ordering-System

## Overview
This project is an e-commerce platform designed with a microservice architecture to ensure high availability and scalability. The platform consists of various services such as User Service, Commodity Service, Promotion Service, and Order Service, each implemented as a separate microservice. The primary technologies used include Spring Boot, MySQL, Redis, RocketMQ, and Spring Cloud.

## Project Architecture
### Decoupled Order Processing
- **Stock Processing:** Utilizes cache (Redis) to manage stock.
- **Order Processing:** Uses message queue (RocketMQ) to handle orders.
- **Distributed Session:** Ensures consistency across different services.

### Microservices
- **User Service:** Manages user-related functionalities.
- **Commodity Service:** Handles product-related operations.
- **Promotion Service:** Manages promotional activities (backed by MySQL and Redis).
- **Order Service:** Processes orders (uses RocketMQ for message queuing).

## Technologies Used
- **Spring Boot:** Framework for application development.
- **MySQL:** Relational database for persistent storage.
- **JOOQ:** ORM tool for database interactions.
- **Redis:** In-memory data structure store, used for caching and session management.
- **RocketMQ:** Distributed messaging and streaming platform.
- **Spring Cloud Gateway:** API gateway for routing and load balancing.
- **Consul:** Service discovery and configuration tool.

## Technical Highlights
- **MySQL vs Oracle:** Comparison of database choices; Oracle for high concurrency, MySQL for cost-effectiveness.
- **Logging:** Implemented using SLF4J and Logback, with custom configurations.
- **Lombok:** Utilized for reducing boilerplate code with annotations like `@Slf4j` and `@Data`.
- **DAO Layer:** Implemented with JPA, providing an abstract interface to the database.
- **Redis Cache:** Employed for reducing database load and increasing performance.
- **Distributed Locking:** Implemented using Redis to manage concurrency.
- **Spring Boot and MySQL Integration:** Simplified data manipulation using Spring Data JPA.
- **Microservices Communication:** Facilitated using Spring Cloud and Consul.

## Setting Up the Project
### Prerequisites
- Java 11+
- Maven
- Docker (for containerized deployment)
- MySQL
- Redis
- RocketMQ
- Consul

### Installation
1. **Clone the repository:**
    ```sh
    git clone https://github.com/yourusername/ecommerce-platform.git
    cd ecommerce-platform
    ```

2. **Build the project:**
    ```sh
    mvn clean install
    ```

3. **Configure the application:**
    Update the `application.yml` files in each service with your database and Redis configurations.

4. **Run the services:**
    ```sh
    mvn spring-boot:run
    ```
    Alternatively, you can use Docker to deploy the services.

### Deployment with Docker
1. **Build Docker images:**
    ```sh
    docker-compose build
    ```

2. **Run Docker containers:**
    ```sh
    docker-compose up
    ```

## Key Features
- **High Availability:** Microservice architecture ensures high availability and fault tolerance.
- **Scalability:** Services can be scaled independently based on load.
- **Consistency:** Distributed session management ensures data consistency.
- **Efficiency:** Improved performance with Redis caching and optimized database queries.

