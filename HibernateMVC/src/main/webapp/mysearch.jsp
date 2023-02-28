<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="3px solid black">
<tr>
	<td>Id</td>
	<td>FirstName</td>
	<td>LastName</td>
	
</tr>

<c:forEach items="${sessionScope.SearchList}" var="i">
<tr>

	<td>${i.id}</td>
	<td>${i.firstName}</td>
	<td>${i.lastName}</td>
		
</tr>
</c:forEach>

</table>
</body>
</html>