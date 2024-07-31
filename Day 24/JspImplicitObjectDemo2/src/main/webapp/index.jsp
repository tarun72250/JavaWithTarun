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
						String name = "Arpit Soni";
					    out.print(name);
				%>
				
				<%
						session.setAttribute("session_key", "Tarun Rathore");	
				%>
				
				
	<form action="another.jsp" >
		<input type="text" name="name" placeholder="Enter name" /><br /><br />
		<input type="submit" value="Click Me" /><br /><br />
	</form>

		
</body>
</html>