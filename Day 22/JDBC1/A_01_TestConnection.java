package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A_01_TestConnection
{
	public static void main(String[] args)//throws SQLException , ClassNotFoundException //throws Exception
	{
	
		        //1. loading driver class in memory
				try
				{
					//hidden step
					//driver gets registered with DriverManager
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					
					//protocol-main    //sub-protocol database-vendor   //subname-path on the network
					String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
					
					//2. Establish the connection
					Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
					System.out.println("connection established");
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("driver class not found");
				}
				catch(SQLException e)
				{
					System.out.println("connection rejected");
				}
	}
}
