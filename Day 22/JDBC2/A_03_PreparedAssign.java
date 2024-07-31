package JDBC2;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.TreeSet;
//This code demonstrates how to retrieve employee data from a MySQL database and store it in custom A_03_Emp
//objects. The HashSet ensures that each employee object is stored only once, even if there are duplicate 
//entries based on the equals() method (which compares empno). Finally, it iterates through the HashSet 
//and prints the employee details. and also this will generate sequence according to hashCode which is defined in class A_03_Emp and deptno wise

public class A_03_PreparedAssign 
{

	public static void main(String[] args) throws Exception 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
		//2. Establish the connection
		Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
		System.out.println("connection established");

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
 
		//so this will generate sequence according to hashCode which is defined in class A_03_Emp and deptno wise
		Set<A_03_Emp> emps = new HashSet<>();//hashcode() and equals() override
		
		
        // Iterate through the result set and create Emp objects from the retrieved data
		while(rs.next())
		{
			A_03_Emp e = new A_03_Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(6), rs.getInt(8));
			emps.add(e);
		}
        
		// Print the details of each employee stored in the TreeSet and HashSet
		for(A_03_Emp e : emps)
		{
		System.out.println(e);
		}
		
		
		rs.close();
		st.close();
		con.close();
		//emps.forEach((n)->{System.out.println(n);});
		
	
	}

}

