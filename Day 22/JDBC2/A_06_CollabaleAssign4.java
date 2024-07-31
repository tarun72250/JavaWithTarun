package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.io.*;


public class A_06_CollabaleAssign4 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
		//2. Establish the connection
		Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
		System.out.println("connection established");
	
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("call allinfo()");
		
		while(rs.next()) 
		{
			System.out.print(rs.getInt(1)+":");
			System.out.print(rs.getString(2)+":");
			System.out.print(rs.getString(3)+":");
			System.out.println();
		}
		
		rs.close();
		st.close();
		con.close();
		
		
	}

}

/*
use dac;
call getSalary(7900);

use dac;
Delimiter //
CREATE DEFINER=`root`@`localhost` PROCEDURE `allinfo`()
BEGIN
	select * from employee;
END
//

use dac;
call allinfo();


*/