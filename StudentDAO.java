//StudentDAO.java

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
    // Adding a new student to the database
    public void addStudent(Student student) {
        try (
            // Establish database connection and prepare SQL insert statement
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?, ?, ?, ?)")
        ) {
            // Set values for the placeholders in the SQL statement
            ps.setString(1, student.getName());
            ps.setInt(2, student.getPRN());
            ps.setString(3, student.getBranch());
            ps.setString(4, student.getBatch());
            ps.setFloat(5, student.getCGPA());

            // Execute the insert operation
            ps.executeUpdate();
        } catch (SQLException e) {
            // Handle SQL errors
            System.out.println("Error adding student: " + e.getMessage());
        }
    }
