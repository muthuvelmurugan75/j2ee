<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="java.util.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<table>
<tr>
	<th>Id </th>
		<th>Name </th>
		<th>bookname </th>
	
	<th>bookamount</th>
</tr>



<%
ArrayList<HashMap> details = (ArrayList)request.getAttribute("details");
out.print(details.size());
for(int i=0;i<details.size();i++)
{

	HashMap<String, String> s = (HashMap)details.get(i);


%>

<tr>
<td><%  out.println(s.get("id")); %></td>
<td><%  out.println(s.get("name")); %></td>
<td><%  out.println(s.get("bookname")); %></td>

<td><% out.println(s.get("bookamount")); %></td>
</tr>
<a href="enterprojectlibrary.jsp">Add details</a>

<%
}
%>

</table>

</head>
<body>

</body>
</html>