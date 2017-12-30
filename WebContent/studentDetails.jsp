<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
<table>
<tr>
	<th>Name </th>
	<th>passwordl</th>
</tr>



<%
ArrayList<HashMap> details = (ArrayList)request.getAttribute("details");
out.print(details.size());
for(int i=0;i<details.size();i++)
{

	HashMap<String, String> s = (HashMap)details.get(i);


%>

<tr>
<td><%  out.println(s.get("name")); %></td>
<td><% out.println(s.get("password")); %></td>
</tr>
<a href="">Add details</a>

<%
}
%>

</table>

</head>
<body>

</body>
</html>