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
				  
				       <div class="h1"> <h1> <span style="color:red;"><h1>You can change your profile in this page</h1>


REQUEST data in profile page
<table>
	<tr>
		<td>NAME :</td>
		<td> 
		   <%
String name =(String)request.getAttribute("name");
out.println("Mrs ."+name); %>
		</td>
	</tr>
</table>


SESSION  data in profile page

<table>
	<tr>
		<td>NAME :</td>
		<td> 
		   <%
String names =(String)session.getAttribute("sesssionName");
out.println("Mrs ."+names); %>
		</td>
	</tr>
</table></span></h1> </div>
				       <div class="h1" >  </div>
				       <div  class="h1">  </div>
				       </div>
				  
				  </div>
				  
				  
</body>
</html>