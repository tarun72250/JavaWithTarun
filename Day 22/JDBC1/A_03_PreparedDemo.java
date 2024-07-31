package JDBC1; // Package declaration

import java.io.InputStreamReader; // Importing InputStreamReader class from java.io package
import java.sql.Connection; // Importing Connection class from java.sql package
import java.sql.DriverManager; // Importing DriverManager class from java.sql package
import java.sql.PreparedStatement; // Importing PreparedStatement class from java.sql package
import java.sql.ResultSet; // Importing ResultSet class from java.sql package
import java.io.*; // Importing all classes from java.io package

//I want top find particular deptno greater slaary employee record.
public class A_03_PreparedDemo { // Declaration of a public class named PreparedDemo

    public static void main(String[] args) throws Exception { // Main method declaration with exception handling

        // Loading the MySQL JDBC driver class dynamically
        Class.forName("com.mysql.cj.jdbc.Driver");

        String jdbcUrl = "jdbc:mysql://localhost:3306/dac"; // URL for connecting to the database named "dac" running locally on port 3306

        // Establishing a connection to the MySQL database using the DriverManager class
        Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
        System.out.println("connection established"); // Printing a message to indicate successful connection

        // Creating a PreparedStatement to execute a parameterized(with parmeter) SQL query
        PreparedStatement ps = con.prepareStatement("select * from employee where deptno = ? and sal > ?");

        // Creating a BufferedReader to read input from the console
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        // Prompting the user to enter the department number
        System.out.println("Enter dept no:");
        int dept=Integer.parseInt(br.readLine()); // Reading the department number input from the user

        // Prompting the user to enter the minimum salary
        System.out.println("Enter min sal:");
        float sal=Float.parseFloat(br.readLine()); // Reading the minimum salary input from the user

        // Setting the department number and minimum salary as parameters in the prepared statement
        ps.setInt(1,dept);
        ps.setFloat(2, sal);

        // Executing the SQL query and storing the result set
        ResultSet rs=ps.executeQuery();

        // Iterating through the result set and printing the details of each employee
        while(rs.next())
        {
            System.out.print(rs.getInt(1)+" : "); // Printing employee ID
            System.out.print(rs.getString(2)+" : "); // Printing employee name
            System.out.print(rs.getString(3)+" : "); // Printing employee job
            System.out.print(rs.getFloat(6)+" : "); // Printing employee salary
            System.out.print(rs.getInt(8)+" : "); // Printing employee department number
            System.out.println(); // Printing a newline
        }

        // Closing the database connection, prepared statement, BufferedReader, and result set
        con.close();
        ps.close();
        br.close();
        rs.close();
    }
}
