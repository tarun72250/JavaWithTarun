<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Profile Page</h2></br></br></br>
				<h3>Institute Name : ${sessionScope.session_key }</h3>

<a href="about_us.jsp" >About me </a></br></br></br>
			<a href="index.jsp" >Index Page </a></br></br></br>
			<a href="contact.jsp" >Contact page </a></br></br></br>
			
			<h4>Param Name :${param.name1}</h4>
</body>
</html>