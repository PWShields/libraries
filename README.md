# Libraries

## Demo of Spring Boot API

#### Technology Stack

- Java 8
- Spring Boot 2
- Spring 5
- Maven
- Lombok
- H2 
- Thymeleaf
- Webjars

#### Datasource

We are using a pre-populated in memory database.
Spring JPA creates the table automatically on start up based on the Entity class.
The database is populated by Spring boot reading the data.sql file.

#### Endpoints

- http://localhost:8080/libraries
returns all records
- http://localhost:8080/libraries/1 returns the record with id=1
- http://localhost:8080/h2-console will take you to the database console, the password is specified in application.properties
- http://localhost:8080/demo will take you to a HTML page that demonstrates Thymeleaf as a view technology