//StudentOperations.java

import java.util.*;
// Handles operations related to students at the application level
public class StudentOperations {

    // Instance of StudentDAO to interact with the database
    private StudentDAO dao;

    // Constructor initializes the DAO object
    public StudentOperations() {
        dao = new StudentDAO();
    }

    // Adding a new student via DAO and confirm to user
    public void addStudent(Student student) {
        dao.addStudent(student);  // Call DAO to insert student into DB
        System.out.println("Student added successfully.");
    }


    // Fetching and displaying all students from the database
    public void displayStudents() {
        ArrayList<Student> list = dao.getAllStudents();  // Get list from DB
        if (list.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : list) s.display();  // Display each student's info
        }
    }

