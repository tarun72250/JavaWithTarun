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
						request.setAttribute("param_key","Tarun Rathore");
					out.print("Hello ,"+request.getAttribute("param_key"));
			%>
			
			<h1>Hello ,${ requestScope.param_key}</h1>
			
			<a href="about_us.jsp" >About me </a></br></br></br>
			<a href="profile.jsp" >Profile page </a></br></br></br>
			<a href="contact.jsp" >Contact page </a></br></br></br>
			
			
			<%
				session.setAttribute("session_key","DebugShala");
			%>
			
			
				<form action="another.jsp" method="get">
					<input type="text" name="name1"  placeholder="Enter Value"/>
					<input type="submit" value="Submit"/>
				</form>
				
			
			

</body>
</html>