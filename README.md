# Employee Leave Management System

A simple Java application that manages employee information and leave requests while demonstrating core Object-Oriented Programming (OOP) concepts.

## Objective

Build a basic employee leave management system and progressively improve it using OOP principles, inheritance, and reusable code.

## Features

- Store employee ID, name, department, and leave balance.
- Apply for and cancel leave requests.
- Track leave request status and history.
- Support Full-Time Employees, Part-Time Employees, Interns, and Managers.
- Apply different annual leave allowances based on employee type.
- Validate leave requests and handle exceptions.

## OOP Concepts

- **Encapsulation:** Protect employee data using private fields and controlled access.
- **Inheritance:** Extend the `Employee` class to create specialised employee types.
- **Abstraction:** Define common employee behaviour and abstract leave policies.
- **Polymorphism:** Process different employee types through `Employee` references.
- **Method Overriding:** Implement employee-specific leave allowances.
- **Method Overloading:** Support leave applications with or without a reason.
- **Access Modifiers:** Control access to fields, constructors, and methods.

## Employee Types

| Type | Description |
|---|---|
| `Employee` | Base class for common employee details and leave operations |
| `FullTimeEmployee` | Employee with a full-time leave allowance |
| `PartTimeEmployee` | Employee with a part-time leave allowance |
| `Intern` | Employee with an intern leave allowance |
| `Manager` | Employee with additional leave benefits |

## Refactoring Improvements

1. **Exception Handling:** Validate leave duration, available balance, and leave reasons. Handle invalid requests using `LeaveException`.
2. **Maintainability:** Replace hardcoded annual leave allowances with named constants in employee subclasses, making leave policies easier to modify.

## Project Structure

```text
src/
├── Employee.java
├── FullTimeEmployee.java
├── PartTimeEmployee.java
├── Intern.java
├── Manager.java
├── LeaveRequest.java
├── LeaveException.java
└── Main.java
```

*Adjust the structure above to match the actual files in your repository.*

## How to Run

1. Clone the repository.
2. Open the project in a Java Intellij/Eclipse IDE or terminal.
3. Compile the Java source files.
4. Run the class containing the `main()` method.

## Git Workflow

The project is developed incrementally using meaningful commits covering the employee design, leave management, OOP concepts, manager support, and refactoring.

## Author

Developed as an academic exercise to understand and apply OOP principles in Java.