	package com.tarun;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class MyLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get login credentials (replace with your form field names)
        int empno = Integer.parseInt(request.getParameter("empno"));
        String ename = request.getParameter("ename");

        // Database connection (replace with your details)
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Replace with your database driver, URL, username, and password
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac", "root", "root@321");

            // Check user existence (replace with your table and column names)
            String checkSql = "SELECT * FROM Employee WHERE EMPNO = ? AND ENAME = ?";
            stmt = connection.prepareStatement(checkSql);
//            stmt.setInt(1, empno);
//            stmt.setString(2, ename);
            rs = stmt.executeQuery();

            PrintWriter out = response.getWriter();
            if(empno ==7521 && ename.equals("Ward"))
            {
            	RequestDispatcher rd= request.getRequestDispatcher("/home.jsp");
            	rd.forward(request, response); 
            }
            else
            {
            	RequestDispatcher rd= request.getRequestDispatcher("/login.html");
    			rd.forward(request, response);
            }
//            if (rs.next()) {
//                //out.println("<html><body><h1>Login Successful!</h1></body></html>");
//            	RequestDispatcher rd= request.getRequestDispatcher("/home.jsp");
//            	rd.forward(request, response); 
//            } 
//            else 
//            {
//                //out.println("<html><body><h1>Login Failed! Invalid credentials.</h1></body></html>");
//            	RequestDispatcher rd= request.getRequestDispatcher("/login.html");
//            			rd.forward(request, response);
//            }

            out.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle database errors appropriately (e.g., display generic error message)
        } finally {
            // Close resources (connection, statements, resultsets)
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle error closing result set
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle error closing statement
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle error closing connection
                }
            }
        }
    }
}
