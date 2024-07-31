<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	

				<% 
				//I will get session value from index.jsp
					String myname = (String)session.getAttribute("session_key");
				    out.print(myname);
				%>
				
				<%
				//I will fetch form value from index.jsp form
					String fname = request.getParameter("name");
					out.print(fname);
				%>
				

</body>
</html>