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

-- Inserting sample student records
INSERT INTO students (name, prn, branch, batch, cgpa) VALUES 
('Dheer', 101, 'Computer', '2022', 8.5),
('Asho Thekkeparampil', 102, 'IT', '2022', 7.9),
('Eric Siqueira', 103, 'Mechanical', '2022', 7.3),
('Ameya Tipnis', 104, 'Electrical', '2022', 8.0),
('Priya Shah', 105, 'Civil', '2022', 8.8),
('Sneha Iyer', 106, 'Electronics', '2022', 9.0);
