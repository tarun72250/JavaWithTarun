package JDBC2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//retrieve and display the details of the employee corresponding to that employee number from the 'employee' table?"
public class A_01_PreparedAssign1 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
		//2. Establish the connection
		Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
		
		System.out.println("connection established");
	
		Statement st=con.createStatement();
		PreparedStatement ps =con.prepareStatement("Select * from employee where empno=? ");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter empno no:");
		int empno=Integer.parseInt(br.readLine());
		
		ps.setInt(1,empno);
		ResultSet rs=ps.executeQuery();
		
		System.out.println("\n"+empno+" id of Employee information");
		if(rs.next())
		{
			System.out.print(rs.getInt(1)+" | ");
			System.out.print(rs.getString(2)+" | ");
			System.out.print(rs.getString(3)+" | ");
			System.out.print(rs.getInt(4)+" | ");
			System.out.print(rs.getInt(8));
		}
		else
		{
			System.out.println("Empno no found");
		}
		
		con.close();
		st.close();
		ps.close();
		rs.close();
		

	}

}
