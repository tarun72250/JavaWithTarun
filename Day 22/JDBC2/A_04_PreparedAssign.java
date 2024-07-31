package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;
//Write a Java program that retrieves employee data (employee number, name, job, salary, department) from a MySQL database and 
//prints the details of each employee sorted by their sallery and after their empno in descending order.
public class A_04_PreparedAssign {

	public static void main(String[] args) throws Exception 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
		//2. Establish the connection
		Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
		System.out.println("connection established");

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		// Create a TreeSet to store Emp objects sorted by job
		Set<A_04_Emp> emps = new TreeSet<>() ;//compareTo() override in desc order
        

        // Iterate through the result set and create Emp objects from the retrieved data
		while(rs.next())
		{
			A_04_Emp e = new A_04_Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(6), rs.getInt(8));
			emps.add(e);
		}
        
		// Print the details of each employee stored in the TreeSet in desc order
//		for(A_04_Emp e : emps)
//		{
//		System.out.println(e);
//		}
		emps.forEach((n)->{System.out.println(n);});
		
		
		rs.close();
		st.close();
		con.close();
		
	
	}

}
