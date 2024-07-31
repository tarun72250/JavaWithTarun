package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;

//This code retrieves employee data from a MySQL database and sorts them by salary in 
//descending order before printing their details.
public class A_07_PreparedAssignUsingTreeSet
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
		
		Set<A_07_EmpUsingTreeSetImplementsComparable> emps=new TreeSet<>();
		
		while(rs.next())
		{
			A_07_EmpUsingTreeSetImplementsComparable e=new A_07_EmpUsingTreeSetImplementsComparable(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(6),rs.getInt(8));
			emps.add(e);
		}
		
		st.close();
		rs.close();
		con.close();
		
		emps.forEach((n)->{System.out.println(n);});
	}

}
