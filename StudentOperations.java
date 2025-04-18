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

