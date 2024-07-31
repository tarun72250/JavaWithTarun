package hello;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class MyLogin extends HttpServlet 
{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
        String pwd = request.getParameter("pass");

        PrintWriter out = response.getWriter();
        
        if (email.equals("tarun123@gmail.com") && pwd.equals("tarun123")) {
          //  request.setAttribute("name_key", "Tarun Rathore");

        	HttpSession session = request.getSession();
        	session.setAttribute("name_key","Tarun Rathore");
        	
            RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
            rd.forward(request, response);
        } else {
            response.setContentType("text/html");
            out.print("<h3 style='color:red'>Email id and password didn't match</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
		
	}
}
