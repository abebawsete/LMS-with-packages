# Library Management System Package-Based OOP Project

# Project Overview
This Library Management System  is a Java-based console application designed using **Object-Oriented Programming (OOP)** principles and **Java Package Architecture**. The system demonstrates real-world software design concepts such as modularization, inheritance, encapsulation, and CRUD operations.

This project is structured to simulate a basic digital library where users can manage different types of books efficiently.

## Key Features
- Add different types of books (EBook, PrintedBook)
- View all available books in the library
- Search books by unique ID
- Update existing book details
- Delete books from the system
- Menu-driven console interface for user interaction

## System Architecture

- **parent**:  Contains the base class representing common book attributes
- **category**:  Contains specialized book types (EBook, PrintedBook)
- **service**: Contains core business logic (Library operations / CRUD functionality)
- **main**: Entry point of the application (MiniProject)


## Object-Oriented Concepts Applied
- **Encapsulation** : Data hiding using private fields and getters/setters
- **Inheritance**   : Specialized book types inherit from base Book class
- **Polymorphism**  : Method overriding for customized display behavior
- **Abstraction**   : Separation of logic across service and model layers
- **Modularity**    : Organized using Java packages for scalability


## Package Structure

LMS/
- **parent**  : Core entity (Book)
- **category** : Specialized book types
- **service**  : Business logic (Library CRUD operations)
- ***main**  : Application entry point


## Build & Execution Guide

### Step 1: Navigate to project root
Ensure you are inside the LMS directory:

cd LMS

### Step 2: Compile the project
Compile all source files from the root directory:

javac -d . parent/*.java category/*.java service/*.java main/*.java

### Step 3: Run the application
Execute the main class using fully qualified package name:
java main.MiniProject

## Learning Outcomes
This project demonstrates:
- Real-world application of Java packages
- Clean separation of concerns in software design
- Implementation of CRUD operations
- Handling user input in console-based applications
- Scalable project structure for enterprise-level development
## Author
**Abebaw Sete** 
Kombolcha Institute of Technology  
Department of Computer Science
Lecturer
https://github.com/abebawsete/
