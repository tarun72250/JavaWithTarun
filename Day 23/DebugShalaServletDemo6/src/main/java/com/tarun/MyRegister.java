package com.tarun;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myRegister")
public class MyRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get form data
        int empno = Integer.parseInt(request.getParameter("empno"));
        String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        Integer mgr = request.getParameter("mgr") != null ? Integer.parseInt(request.getParameter("mgr")) : null;
        Date hiredate = Date.valueOf(request.getParameter("hiredate"));
        Double sal = request.getParameter("sal") != null ? Double.parseDouble(request.getParameter("sal")) : null;
        Double comm = request.getParameter("comm") != null ? Double.parseDouble(request.getParameter("comm")) : null;
        int deptno = Integer.parseInt(request.getParameter("deptno"));

        // Database connection (replace with your connection details)
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Replace with your database driver, URL, username, and password
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac", "root", "root@321");

            // Insert data into Employee table
            String insertSql = "INSERT INTO Employee (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(insertSql);
            stmt.setInt(1, empno);
            stmt.setString(2, ename);
            stmt.setString(3, job);
            stmt.setInt(4, mgr != null ? mgr : 0); // Set default 0 if mgr is null
            stmt.setDate(5, hiredate);
            stmt.setDouble(6, sal != null ? sal : 0.0); // Set default 0.0 if sal is null
            stmt.setDouble(7, comm != null ? comm : 0.0); // Set default 0.0 if comm is null
            stmt.setInt(8, deptno);
            stmt.executeUpdate();

            // Get all existing employees (replace with your actual query)
            String selectSql = "SELECT * FROM Employee"; // Modify this query to filter/sort data as needed
            stmt = connection.prepareStatement(selectSql);
            rs = stmt.executeQuery();

            // Prepare response
            PrintWriter out = response.getWriter();
            out.println("<html><body>");

            // Display registration confirmation
            out.println("<h2>Employee Registered Successfully!</h2>");

            // Display existing employees (optional, modify as needed)
            if (rs.next()) {
                out.println("<h3>Existing Employees:</h3>");
                out.println("<table>");
                out.println("<tr><th>EMPNO</th><th>ENAME</th><th>JOB</th><th>MGR</th><th>HIREDATE</th><th>SAL</th><th>COMM</th><th>DEPTNO</th></tr>");
                do {
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt("EMPNO") + "</td>");
                    out.println("<td>" + rs.getString("ENAME") + "</td>");
                    out.println("<td>" + rs.getString("JOB") + "</td>");
                    out.println("<td>" + rs.getInt("MGR") + "</td>");
                    out.println("<td>" + rs.getDate("HIREDATE") + "</td>");
                    out.println("<td>" + rs.getDouble("SAL") + "</td>");
                    out.println("<td>" + rs.getDouble("COMM") + "</td>");
                    out.println("<td>" + rs.getInt("DEPTNO") + "</td>");
                    out.println("</tr>");
                } while (rs.next());
                out.println("</table>");
            } else {
                out.println("No existing employees found.");
            }

            out.println("</body></html>");
            out.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle database errors appropriately (e.g., display error message)
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