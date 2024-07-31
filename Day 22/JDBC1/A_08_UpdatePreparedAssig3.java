package JDBC1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//this program aims to provide a user-friendly interface for updating employee salaries in a MySQL database. It prompts the user for necessary information, performs the update operation,
public class A_08_UpdatePreparedAssig3 {

    public static void main(String[] args) throws Exception
    {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Define JDBC URL to establish the connection to the database
        String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
        
        // Establish the connection to the database
        Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
        System.out.println("Connection established");
        
        // Create a prepared statement to update employee salary based on employee number
        PreparedStatement ps = con.prepareStatement("update employee set sal = ? where empno = ?");
        
        // Create a BufferedReader object to read input from the user
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt the user to enter the salary to update
        System.out.println("Enter sal to update:");
        float sal=Float.parseFloat(br.readLine());
        
        // Prompt the user to enter the employee number
        System.out.println("Enter empno :");
        int empno=Integer.parseInt(br.readLine());
        
        // Set the parameters (salary and employee number) in the prepared statement
        ps.setFloat(1,sal);
        ps.setInt(2,empno);
        
        // Execute the update statement and retrieve the number of rows affected
        int n=ps.executeUpdate();
        System.out.println("Result updated");
        
        // Close the connection, prepared statement, and BufferedReader to release resources
        con.close();
        ps.close();
        br.close();
    }
}
