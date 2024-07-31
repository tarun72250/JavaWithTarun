package JDBC2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//This code allows a user to interactively update the salary of an employee in a MySQL database.
//Here's a shortened problem statement:
public class A_08_UpdatableAssign7 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dac";
		//2. Establish the connection
		Connection con = DriverManager.getConnection(jdbcUrl, "root", "root@321");
		System.out.println("connection established");
	
	

		//3.creating the statement
		PreparedStatement ps = con.prepareStatement("update employee set sal = ? where empno = ?");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter sal to update:");
		float sal=Float.parseFloat(br.readLine());
		
		System.out.println("Enter empno :");
		int empno=Integer.parseInt(br.readLine());
		
		ps.setFloat(1,sal);
		ps.setInt(2,empno);
		
		int n=ps.executeUpdate();
		System.out.println("Update succesfully ");
		
		
		
		con.close();
		ps.close();
		br.close();
		//rs.close();

	}

}