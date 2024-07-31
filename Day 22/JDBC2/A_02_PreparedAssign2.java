package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.InputStreamReader;
import java.io.*;
//the user to input salary range, and then retrieve and display the details of employees whose salaries fall within that range from the 'employee' table.
public class A_02_PreparedAssign2 {

	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
		//2. Establish the connection
		Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
		System.out.println("connection established");
	
	
		Statement st=con.createStatement();
		
		//3.creating the statement
		PreparedStatement ps=con.prepareStatement("select * from employee where sal between ? and ?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter sal start range:");
		float sal=Float.parseFloat(br.readLine());
		
		System.out.println("Enter sal end range:");
		float sal1=Float.parseFloat(br.readLine());
		
		ps.setFloat(1,sal);
		ps.setFloat(2, sal1);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" : ");
			System.out.print(rs.getString(2)+" : ");
			System.out.print(rs.getString(3)+" : ");
			System.out.print(rs.getInt(4)+" : ");
			System.out.print(rs.getFloat(6)+" : ");
			System.out.print(rs.getInt(8)+" : ");
			System.out.println();
		}
		
		con.close();
		st.close();
		ps.close();
		rs.close();
		
		
		

	}

}
