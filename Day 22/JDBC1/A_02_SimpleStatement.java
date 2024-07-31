package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A_02_SimpleStatement {

	public static void main(String[] args) throws Exception
	{
				
					//1. loading driver class in memory
					//hidden step
					//driver gets registered with DriverManager
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
					//2. Establish the connection
					Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
					System.out.println("connection established");
			
				//3.creating the Statement which is 
				//useful for executing query without any parameter 
				Statement st = con.createStatement();
				
				//4.executing statement(actually sending to db for executing)
				//executeQuery() executing select type of queries(DQL) 
				ResultSet rs = st.executeQuery("select * from employee");
				//entire record or subsets of records
				while(rs.next())
				{
					System.out.print("Empno: "+rs.getInt(1)+" : ");
					System.out.print("Ename: "+rs.getString(2)+" : ");
					System.out.print("Dname: "+rs.getString(3)+" : ");
					System.out.print(rs.getInt(4)+" : ");//column no 4
					System.out.print(rs.getInt(6)+" : ");//column no 8
					System.out.print(rs.getInt(8)+" : ");//column no 6
					System.out.println();
				}
				rs.close();
				st.close();
				con.close();

	}

}
