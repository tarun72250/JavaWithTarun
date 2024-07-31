package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;
//this program provides information about each department's average salary, allowing for analysis and comparison of salary distributions across different departments.
public class A_07_ResultToCollectionAssig5 {

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
        
        // Execute a SQL query to retrieve average salary per department, ordered by average salary descending
        ResultSet rs=st.executeQuery("SELECT d.dname, AVG(e.sal) AS avg_salary\r\n"
                + "FROM employee e \n"
                + "JOIN dept d ON e.deptno = d.deptno \r\n"//  \r placed cursor at starting position of line
                + "GROUP BY d.dname\r\n"                   //  \n is for newLine
                + "ORDER BY avg_salary DESC;");
        
        // Create a TreeSet to store the result set
        // Note: We are not using Emp class here, as we are only retrieving department names and average salaries
        // If Emp class is intended to represent employees, it's not used in this context
        // Instead, we're directly printing the department name and average salary
        while(rs.next())
        {
            // Print department name and average salary from the current row of the result set
            System.out.println(rs.getString(1)); // Department name
            System.out.println(rs.getFloat(2)); // Average salary
            System.out.println(); // Empty line for separation between departments
        }
        
        // Close the result set, statement, and connection to release resources
        rs.close();
        st.close();
        con.close();
    }
}

/*
  SELECT d.dname, AVG(e.sal) AS avg_salary
FROM employee e
JOIN dept d ON e.deptno = d.deptno
GROUP BY d.dname
ORDER BY avg_salary DESC;
+------------+-------------+
| dname      | avg_salary  |
+------------+-------------+
| ACCOUNTING | 2916.666667 |
| RESEARCH   | 2175.000000 |
| SALES      | 1593.500000 |
+------------+-------------+

CREATE TABLE dept (
  deptno INT PRIMARY KEY,
  dname VARCHAR(255) NOT NULL
);


INSERT INTO dept (deptno, dname) VALUES (10, 'RESEARCH');
INSERT INTO dept (deptno, dname) VALUES (20, 'ACCOUNTING');
INSERT INTO dept (deptno, dname) VALUES (30, 'SALES');

 * */
