package JDBC2;

import java.util.Set;
import java.util.TreeSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//This code retrieves employee data from a MySQL database and sorts them by job title in 
//ascending order before printing the details and make ensure for duplicates jobs are not allowed
public class A_05_PreparedAssign3B {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
		//2. Establish the connection
		Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
		System.out.println("connection established");

		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from employee");
		
		Set<A_05_Emp> emps=new TreeSet<>();
		//duplicates jobs are not allowed
		
		while(rs.next())
		{
			A_05_Emp e = new A_05_Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(6), rs.getInt(8));
			emps.add(e);
		}
		
		for(A_05_Emp e : emps)
		
		System.out.println(e);
		rs.close();
		st.close();
		con.close();

	}

}
