//package JDBC1;
//
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Types;
//
//import com.mysql.cj.jdbc.CallableStatement;

package JDBC1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

//Write a Java program that interacts with a MySQL database to call a stored procedure. The stored procedure retrieves the details of an employee based on their employee number.
public class A_04_CallableDemo {

	  public static void main(String[] args) throws SQLException, ClassNotFoundException, NumberFormatException, IOException 
	  {

		    String url = "jdbc:mysql://localhost:3306/dac";
	        String username = "root";
	        String password = "root@321";

	        // Connect to the database
	        Connection connection = DriverManager.getConnection(url, username, password);

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter employee number: ");
	        int empNo = Integer.parseInt(br.readLine());//throws NumberFormatException.

	        // Callable statement for the stored procedure
	        CallableStatement call = connection.prepareCall("{call getEmployeeDetails(?)}");

	        // Set the input parameter
	        call.setInt(1, empNo);

	        // Execute the stored procedure
	        ResultSet result = call.executeQuery();

	        // Display employee details if found
	        if (result.next()) {
	            System.out.println("Employee Details:");
	            System.out.println("Employee Number: " + result.getInt("empno"));
	            System.out.println("Employee Name: " + result.getString("ename"));
	            System.out.println("Job Title: " + result.getString("job"));
	            // ... (display other details)
	        } 
	        else 
	        {
	            System.out.println("Employee with ID " + empNo + " not found.");
	        }

	        // Close resources
	        result.close();
	        call.close();
	        connection.close();
	    }
}

