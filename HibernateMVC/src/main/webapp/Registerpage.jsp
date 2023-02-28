<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
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

</body>
</html>