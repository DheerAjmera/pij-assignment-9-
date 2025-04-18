# pij-assignment-9
# Student-Database-SQL-
This Java project is a Student Database Management System using MySQL for storage. It allows users to add, view, search, update, and delete student records through a console interface. The application uses JDBC for database connectivity and follows a clean MVC-like separation with DAO handling database operations.

## Features
- Add new student records
- Display all students from the database
- Search student by:
  - PRN
  - Name
  - Index Position
- Update student details by PRN
- Delete a student by PRN
- Uses MySQL for backend storage

## Project Structure
- Main.java                   User interface & menu
- Student.java                POJO class for Student
- StudentOperations.java      Logic layer for handling user operations
- StudentDAO.java             Data Access Object for JDBC interaction
- DBConnection.java           Establishes connection with MySQL
- mysql-connector-j-9.2.0.jar MySQL JDBC Driver (external JAR)
- StudentDatabase             MySQL Database that works as a framework for Student Management System

## Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL (for creating and managing the table)
- Command Line / Terminal

## How to Run 
- Clone the repository: https://github.com/Ameya2137/Student-Database-SQL-.git
- Navigate to the project directory: cd Student-Database-SQL-
- Compile the Java files: javac -cp ".;mysql-connector-j-9.2.0.jar" *.java
- Run the program: java -cp ".;mysql-connector-j-9.2.0.jar" Main
