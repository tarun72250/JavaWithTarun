package JDBC1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
//retrieves data from the 'employee' table, creates Emp objects from the retrieved data,
//stores these objects in a TreeSet (sorted by salary), and then prints the Emp objects.
//The Emp class seems to be a custom class representing an employee, 
//but its definition is not provided in the code snippet.
public class A_06_ResultToCollectionAssig4 
{
    public static void main(String[] args) throws Exception
    {
        // Load the MySQL JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Define JDBC URL to establish the connection to the database
        String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
        
        // Establish the connection to the database
        Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
        System.out.println("Connection established");
    
        // Create a statement object for executing SQL queries
        Statement st=con.createStatement();
        
        // Execute a SQL query to retrieve data from the 'employee' table
        ResultSet rs=st.executeQuery("select * from employee");
        
        // Create a TreeSet to store Employee objects, sorted by salary in descending order by default it arranged descending order.
        Set<Emp> emps = new TreeSet<>();
        
        // Iterate through the result set and create Emp objects from the retrieved data
        while(rs.next())
        {
            // Create an Emp object using data from the current row of the result set
            Emp e = new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(6), rs.getInt(8));
            
            // Add the Emp object to the TreeSet
            emps.add(e);
        }
        
        // Close the result set, statement, and connection to release resources
        rs.close();
        st.close();
        con.close();
        
        // Iterate through the TreeSet and print each Emp object
        System.out.println("Salary arranged in descending order");
        for(Emp e : emps)
            System.out.println(e);
    }
}
