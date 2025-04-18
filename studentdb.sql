-- Creating a database named studentdb
CREATE DATABASE studentdb;

-- Using database studentdb
USE studentdb;

-- Creating a table named students
CREATE TABLE students (
    name VARCHAR(100),
    prn INT PRIMARY KEY,
    branch VARCHAR(50),
    batch VARCHAR(20),
    cgpa FLOAT
);
