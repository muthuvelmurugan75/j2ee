<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
     body{background-color:pink;}
      .home{width:100%; height:600px; border:1px solid blue; }
	  
      
		
	  
</style>

<body>


<div class="home">
	  
				  <div class="header">
				  
				       <div class="h1"> <h1> <span style="color:red;">REQUEST DATA 
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


<a href="setting.jsp">click here to profile</a>
				       </span></h1> </div>
				       <div class="h1" >  </div>
				       <div  class="h1">  </div>
				  
				  </div>
				  </div>
				  
				  
</body>
</html>