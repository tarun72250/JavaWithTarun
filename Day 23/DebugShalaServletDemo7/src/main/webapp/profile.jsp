<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
<%
			
			String myname = (String) session.getAttribute("name_key");
			%>
			<h3>Welcome: <%= myname %></h3>
			
			
			<a href="home.jsp">Home</a>&nbsp;&nbsp;&nbsp;
			<a href="about-us.jsp">About us </a>&nbsp;&nbsp;&nbsp;
			<a href="logout">Logout</a>

</body>
</html>
