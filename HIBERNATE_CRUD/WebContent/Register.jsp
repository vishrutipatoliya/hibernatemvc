<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/RegController" method="post">
<table border="1px solid black">
<tr>
	<td>FIRST_NAME</td>
	<td><input type="text" name="firstName"></td>
</tr>

<tr>
	<td>LAST_NAME</td>
	<td><input type="text" name="lastName"></td>
</tr>

<tr>
	<td colspan="2">
		<center><input type="submit" value="Register"></center>
		<input type="hidden" name="flag" value="insert">
	</td>
</tr>

</table>
</form>

<a href="RegController?flag=search">Search Here For Showing Data</a>

</body>
</html>