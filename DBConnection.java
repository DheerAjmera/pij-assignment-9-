//DBConnection.java

import java.sql.*;

// Utility class to manage database connection
public class DBConnection {
  // Database connection URL (make sure 'studentdb' exists in your MySQL server)
  private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
// MySQL username and password
  private static final String USER = "enter here"; // The username of your MySQL Workbench
  private static final String PASSWORD = "enter here"; // The password of your MYSQl Workbench
// Method to establish and return a connection to the database
    public static Connection getConnection() throws SQLException {
        // Uses DriverManager to create a connection using the URL, username, and password
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
