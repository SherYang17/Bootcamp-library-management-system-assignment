# Library Management System

This is a basic Library Management System built using Spring Boot, Thymeleaf, and Spring Data JPA.

## Project Setup

1. Create a new Spring Boot project using Spring Initializr.
2. Include the following dependencies: Spring Web, Thymeleaf, and Spring Data JPA.
3. Set up your project structure by creating the necessary packages: model, repository, and controller. 
4. Create the Book and Author classes with the required properties in the model package.
5. Create the BookRepository and AuthorRepository interfaces in the repository package.
6. Create the BookController and AuthorController classes in the controller package.

## File Structure
![](https://github.com/SherYang17/library-management-system-assignment/blob/master/src/main/resources/images/hwimg1.png | height = 300)
<img src="https://github.com/SherYang17/library-management-system-assignment/blob/master/src/main/resources/images/hwimg1.png" width=50% height=50%>

## Functionality

### Data Models

The project includes two data models: Book and Author. The Book class represents a book with properties such as id (unique identifier) and title, and it is associated with an Author object. The Author class represents an author with properties such as id, name, and a list of books written by the author.

### Repositories

The project includes two repositories: BookRepository and AuthorRepository. Both repositories extend the JpaRepository interface, providing basic CRUD operations.

### Controllers

The project includes two controllers: BookController and AuthorController. Each controller handles CRUD operations. The controllers are annotated with @Controller and use @RequestMapping to define the endpoints.

### Views

The project includes Thymeleaf templates for each operation (list, create, update, delete) for both Book and Author. These templates can be found in the templates directory. Also included in the index.html file for the homepage. 

### Running and Testing the Application

To run the application:

1. Make sure you have Java and Maven installed on your system.
2. Run the project by
  2a. Command mvn clean install.
  2b. Run the application using the command mvn spring-boot:run.
  or
  2c. Click play beside the LibraryManagement
3. Open your web browser and navigate to http://localhost:8080 to access the application.

To test the CRUD operations:

1. Open your web browser and navigate to http://localhost:8080 to access the application.
2. Test the CRUD operations for both Book and Author entities using the provided forms and buttons.

## Conclusion

This README provides an overview of the Library Management System project, explaining the project setup, the functionality of each component (data models, repositories, controllers, and views), and instructions for running and testing the application.
Thank you for taking the time to read this!
