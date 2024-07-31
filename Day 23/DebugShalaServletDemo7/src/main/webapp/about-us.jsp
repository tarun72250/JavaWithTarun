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
   // String myname = (String) request.getAttribute("name_key");
String myname = (String) session.getAttribute("name_key");

%>
<h3>Welcome: <%= myname %></h3>


<a href="home.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="profile.jsp">Profile </a>

</body>
</html>