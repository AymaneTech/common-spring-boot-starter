# Wora Common Spring Boot Starter

A reusable Spring Boot starter containing common configurations and services that can be leveraged across multiple projects to avoid repetitive code. This starter includes the following components:

## Features

- **Global Exception Handler**: Centralizes error handling with a `@RestControllerAdvice` to catch exceptions and return consistent error responses across the application.

- **OpenAPI Configuration for Swagger**: Configures Swagger/OpenAPI to automatically generate documentation for your REST APIs.

- **Base CRUD Service Interface**: A generic interface that provides standard CRUD operations (Create, Read, Update, Delete) to be extended by specific service classes.

- **Custom Validation Annotations**: Includes two custom validation annotations that can be used to validate various fields in your entities or DTOs.

- **Custom Exceptions**:
    - `EntityNotFoundException`: Thrown when an entity is not found.
    - `EntityCreationFailedException`: Thrown when entity creation fails.

- **Error Response DTO**: A consistent format for API error responses, making it easier to handle and display errors to clients.

- **Abstract Seeder**: A utility class to automatically seed your database from a JSON file during the application startup, ensuring that necessary data is pre-populated in the database.

---

## Getting Started

### Prerequisites

Ensure you have the following dependencies in your `pom.xml` to use this starter:

```xml
<dependency>
    <groupId>com.wora</groupId>
    <artifactId>common-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
