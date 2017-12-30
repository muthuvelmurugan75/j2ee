<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome to java</title>
</head>
<body>
<h1>Welcome to Portal</h1>

REQUEST DATA 
<br>
-------------------------------------------------------------------------------------------
<br>
Hi..........
<%
String name =(String)request.getAttribute("name");
out.println("Mrs ."+name); %>


<br>


SESSION DATA 
<br>
-------------------------------------------------------------------------------------------
<br>
Hi..........
<%
String names =(String)session.getAttribute("sesssionName");
out.println("Mrs ."+names); %>


<br>


<a href="profile.jsp">click here to profile</a>


</body>
</html>