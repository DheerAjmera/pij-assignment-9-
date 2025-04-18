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

    // Searching for a student by PRN (Primary Roll Number)
    public Student searchByPRN(int prn) {
        try (
            // Preparing SQL query with a WHERE clause
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE prn = ?")
        ) {
            ps.setInt(1, prn);  // Set PRN in the query
            ResultSet rs = ps.executeQuery();

            // If student is found, create and return Student object
            if (rs.next()) {
                return new Student(
                    rs.getString("name"),
                    prn,
                    rs.getString("branch"),
                    rs.getString("batch"),
                    rs.getFloat("cgpa")
                );
            }
        } catch (SQLException e) {
            // Handle SQL errors
            System.out.println("Error searching by PRN: " + e.getMessage());
        }

        return null;  // Return null if student not found
    }

     // Updating an existing student's information
    public boolean updateStudent(Student student) {
        try (
            // Preparing SQL update statement
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE students SET name=?, branch=?, batch=?, cgpa=? WHERE prn=?")
        ) {
            // Set updated values in the query
            ps.setString(1, student.getName());
            ps.setString(2, student.getBranch());
            ps.setString(3, student.getBatch());
            ps.setFloat(4, student.getCGPA());
            ps.setInt(5, student.getPRN());

            // Execute update and return true if successful
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            // Handle SQL errors
            System.out.println("Error updating student: " + e.getMessage());
        }

        return false;  // Return false if update fails
    }

    // Deletes a student record based on PRN
    public boolean deleteStudent(int prn) {
        try (
            // Preparing SQL delete statement
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE prn = ?")
        ) {
            ps.setInt(1, prn);  // Set PRN in the query

            // Execute delete and return true if a record was removed
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            // Handle SQL errors
            System.out.println("Error deleting student: " + e.getMessage());
        }

        return false;  // Return false if delete fails
    }
}

