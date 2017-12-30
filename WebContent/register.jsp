<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
     body{background-color:Aquamarine;}
      .home{width:100%; height:600px; border:1px solid blue; }
	 .home{ text-align: justify;
    text-align-last:center;
      }
		
	  
</style>
<body>


<div class="home">
	  
	  
				  <div class="header">
				  
				       <div class="h1"> <h1> <span style="color:blue;">WELCOME</span></h1> </div>
					   <div class="h1"><span style="color:blue;"><h3> <% 
String names =(String)session.getAttribute("sesssionName");
					   
out.println("Mrs ."+names); %></h3></span>
				       <div class="h1" >  </div>
				       <div  class="h1">  </div>
                
				  </div>
				  				       <div class="h1"> <h1> <span style="color:blue;">You are Successfully Registered</span></h1> </div>
				 <a href="ProjectLogin.jsp">Go To Login</a>
				  
				  
</body>
</html>