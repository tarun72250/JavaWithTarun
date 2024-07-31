<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP DEMO</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	</br>
	<!-- This is HTML Comment -->
	</br>
	<%--This is JSP Comment --%>
	
	
	</br>
	<!-- Scriplet tag -->
	<% 
	int n =10;
		out.print("Value of n++ :-"+(n++));//10
		out.print("Value of n :-"+(n));//11
		out.print("Value of n++ :-"+(--n));//10
		out.print("Value of n :-"+(n++));//10
		out.print("Value of n++ :-"+(++n));//12
		out.print("Value of n :-"+(n--));//12
	%>	
	
	</br>
	
	<%
	out.print(Calendar.getInstance().getTime());
	%>
	
		</br>
	
	<%--Expression tag 
	shortcut for out.print()--%>
	<%=Calendar.getInstance().getTime()%>
	
		</br>
	
	<%-- Declaration tag :-
	Mehtods or variable decalartion --%>
	
	<%! int iVar; %>
	<%= "Value of iVar :"+(++iVar) %>
	
	
	
	<%
	//Any valid java code inside scriplet
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
	    String hours = sdf.format(Calendar.getInstance().getTime());
		int hh = Integer.parseInt(hours);
	    if(hh < 12)
	    {   %>
	    	<%= "<h1> GOOD MORNING </h1>" %><
	   <% }
	    else if(hh >= 12 && hh <= 16)
	    {  %>
	    	<%= "<h1> GOOD AFTERNOON </h1>" %>
	    <% }
	    else if(hh > 16 && hh <= 21)
	    { %>
	    	<%= "<h1> GOOD EVENING </h1>" %>
	    <%}
	    else
	    { %>
	    	<%= "<h1> GOOD NIGHT </h1>" %>
       <% }    
	    
	%>
	
	
</body>
</html>