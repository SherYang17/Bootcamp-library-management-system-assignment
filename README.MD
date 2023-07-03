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
<img src="https://github.com/SherYang17/library-management-system-assignment/blob/master/src/main/resources/images/hwimg1.png" height="680">

## Functionality

### Data Models

The project includes two data models: Book and Author. The Book class represents a book with properties such as id (unique identifier) and title, and it is associated with an Author object. The Author class represents an author with properties such as id, name, and a list of books written by the author.

### Repositories

The project includes two repositories: BookRepository and AuthorRepository. Both repositories extend the JpaRepository interface, providing basic CRUD operations.

### Controllers

The project includes two controllers: BookController and AuthorController. Each controller handles CRUD operations. 
Annotions used are
- @Controllers - Marks a class as a Spring MVC Controller. This handles incoming HTTP requests and contains methods to process those requests. 
- @RequestMapping - This maps a URL or path to a specific method in a controller. For example, @RequestMapping("books") from the code, it defines it at class level so that the code written after will map to that location and include other values created afterwards. So if @GetMapping is /create, the URL will go from http://localhost:8080/books to http://localhost:8080/books/create.
- @Autowired - This is used for automatic dependency injection in Spring. It enables automating wiring of beans (components) by type. When we annotate a field, constructor, or setter method with @Autowired, Spring automatically resolves and injects the approriate bean dependency. 
- @Getmapping - This handles http GET requests. It maps a specific URL or path to a method in the controller. 
- @PostMapping - This is similar to @GetMapping except when a request is made to the specified URL, the method  is invoked to process the request and return the response. 


### Views

The project includes Thymeleaf templates for each operation (list, create, update, delete) for both Book and Author. These templates can be found in the templates directory. Also included in the index.html file for the homepage. Each CRUD has it's own template. The styling is simple with no css or bootstrap. 

### Running and Testing the Application

To run the application:

1. Make sure you have Java and Maven installed on your system.
2. Run the project by 
- (option 1) Command mvn clean install and then run the application using the command mvn spring-boot:run.
- (option 2) Run the LibraryManagementSystemApplication class.
3. Open your web browser and navigate to http://localhost:8080 to access the application.

When the console states that the application has started, it means you are able to access it with no issues in http://localhost:8080.
<img src="https://github.com/SherYang17/library-management-system-assignment/blob/master/src/main/resources/images/hwimg2.png" height = "270">

1. Open your web browser and navigate to http://localhost:8080 to access the application.
2. Test the CRUD operations for both Book and Author entities using the provided forms and buttons.

## Conclusion

This README provides an overview of the Library Management System project, explaining the project setup, the functionality of each component (data models, repositories, controllers, and views), and instructions for running and testing the application.
Thank you for taking the time to read this!


## Other Demo's For Reference
### Example 1
In the below image, it shows the http request with the browser URL as http://localhost:8080/authors/delete. We can see in the Network settings that this is a GET request method. We can see this from the Intellij image below displaying the GET request.
- Line 14: @RequestMapping("/authors")
- Line 22: @GetMapping ("/delete")
- Line 26: return authordelete.html template
- What this means is http://localhost:8080 + /authors + /delete = http://localhost:8080/authors/delete. Then it displays the HTML page.

<img src="https://github.com/SherYang17/library-management-system-assignment/blob/master/src/main/resources/images/authorsdelete1.png">

### Example 2
In the below image, I click the Delete button to ID1 or row 1 and the request is made in the browser. We can see under Network tab that clicking the button has created a POST request method. We can see this from the Intellij image below displaying the POST request
- AuthorController Line 29: @PostMapping ("/delete/{id}")
- Authordelete.html Line 23: The form action has method="post". What is performed there will apply from the AuthorController. 
- AuthorController Line 32: Once the button is pressed, the page refreshes and will display remaining Authors

<img src="https://github.com/SherYang17/library-management-system-assignment/blob/master/src/main/resources/images/hwpostdeletion1.png">
