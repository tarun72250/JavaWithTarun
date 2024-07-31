package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//This Java program connects to a MySQL database, updates the salary of an employee with employee number 7900 to 1111, and prints the number of records updated.
public class A_05_DMLStatementDemo {

    public static void main(String[] args) 
    {
        Connection con = null;
        Statement stmt = null;
        try {
            // Load the MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the MySQL database
            String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
            con = DriverManager.getConnection(jdbcUrl, "root", "root@321");

            // Create a statement object for executing SQL queries
            stmt = con.createStatement();

            // Execute the SQL update statement to modify employee salary
            int n = stmt.executeUpdate("update employee set sal = 1111 where empno = 7900");

            // Print the number of records updated
            System.out.println(n + " records updated");
        } 
        catch (ClassNotFoundException e)
        {
            // Handle ClassNotFoundException
            e.printStackTrace();
        } catch (SQLException e) 
        {
            // Handle SQLException
            e.printStackTrace();
        } finally 
        {
            try 
            {
                // Close the statement and connection objects
                if (stmt != null)
                    stmt.close();
                if (con != null)
                    con.close();
            } catch (Exception e) {
                // Handle any exceptions during closing resources
                e.printStackTrace();
            }
        }
    }
}
