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
    
    // Retrieving all students from the database
    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> list = new ArrayList<>();

        try (
            // Connecting to database, create a statement and execute query
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students")
        ) {
            // Iterating over the result set and create Student objects
            while (rs.next()) {
                list.add(new Student(
                    rs.getString("name"),
                    rs.getInt("prn"),
                    rs.getString("branch"),
                    rs.getString("batch"),
                    rs.getFloat("cgpa")
                ));
            }
        } catch (SQLException e) {
            // Handle SQL errors
            System.out.println("Error fetching students: " + e.getMessage());
        }

        return list;
    }
