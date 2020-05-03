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
- http://localhost:8080/h2-console will take you to the database console, the password is specified in 
application.properties
- http://localhost:8080/demo will take you to a HTML page that demonstrates Thymeleaf as a view technology

#### Explanation

This application is meant to demonstrate the following:

1. Lombok:  

    Project Lombok is a mainstream Java project that provides annotations to remove boiler-plate code from Plain Old 
    Java Objects (Pojos). Pojos are what we strive to achieve in Java development.  Lombok provides many annotations 
    including for getters and setters, logging, equals and toString methods. The Data annotation adds getters and 
    setters, equals and toString methods to the class with 1 annotation. You can of-course overwrite the methods 
    provided by Lombok if your use case is very complex. The Libraries class is an example.
2. Spring Data: 
   
    This removes boiler plate code from data access. It supports a large range of datasources and data access techniques
     including JDBC, JPA2 and noSQL.  There are a number of interfaces that can be 
     extended and that provide default implementations of common methods such as findById, findAll and save.
     The @Repository annotation tells Spring to create a repository bean for the class.
      LibrariesRepository is an example for JPA2.
3. Spring JSON support:
  
    The @RestController annotation tells the controller to return JSON data by default. There is no need for explicit 
    mapping from objects to JSON. The default implementation is Jackson which provides a large number of annotations for
     fine tuned control. The LibrariesRestController is an example.
4. Passing data to a view: 

    Spring supports MVC. The @Controller annotation tells the controller to expect the name of a view file to return in
    each method. A model is passed to the view with attributes which the view can then access. These attributes can be 
    complex objects. DemoController and resources/templates/demo/show.html are examples.
5. Spring 5 dependency injection:

    Spring 5 supports a number of different styles of dependency injection, however the recommended style is constructor 
    injection. You no longer need @Autowired annotation to tell Spring to inject a dependency, you only need to declare
    the dependency and include it in the constructor and Spring will know to inject it. The LibrariesRestController is
    an example of injecting a Service into a Controller. The Libraries Service class is an example of injecting a
    Repository into a Service.
6. Spring MVC:

    The @RestController, @Controller, @RequestMapping and @GetMapping annotations are all part of Spring MVC and 
    illustrate the ease with which creating endpoints and routing is achieved.
7. Bootstrapping data:

    Providing a data.sql is one way of bootstrapping data. Spring Boot will run the file on startup.
8. Webjars:

    These are an alternative way of providing Javascript and CSS resources. They are declared as dependencies in the POM
    and used in the View. Show.html is an example.