# Software Engineering (IN2201)

Name: ************G.T. Idusara************

Registration Number: ************244078P************


## Overview

This repository contains the implementation for the laboratory tasks completed for this module. The purpose of this project is to demonstrate basic Java programming concepts and Maven-based project structure.

## Task Summary

### Task 1: Hello World Application

- Purpose: To create a simple Java program that prints output when executed.
- Implemented: A basic Java class was created and configured to run as a Maven project.

### Task 2: Maven Project Setup

- Purpose: To set up the project structure using Maven.
- Implemented: The project includes Maven configuration files, source folders, and test folders for Java development.

### Task 3: Unit Testing

- Purpose: To verify that the application behaves as expected.
- Implemented: A simple test class was added to validate the application output.

## Build and Run Instructions

### Build the project

Run the following command in the project root:

```bash
mvn clean package
```

### Run the application

Run the following command:

```bash
mvn exec:java -Dexec.mainClass=com.mycompany.app.App
```

### Run the tests

Run the following command:

```bash
mvn test
```
