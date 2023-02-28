<%@ page import="org.hibernate.*"
 import= "com.helper.FactoryProvider"
 import ="java.util.*"
 import ="com.entity.Note"
 import ="org.hibernate.*"
 %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IAll notes: Note taker</title>
  <%@ include file="all_js_css.jsp" %>
</head>
<body>
<div class="container">
 <%@ include file="navbar.jsp" %>
 
<br>
<h1 class="text-uppercase">All Notes</h1>
<div class="row">

<div class="col-12">
<% 
Session s = FactoryProvider.getFactory().openSession();
Query q = s.createQuery("from Note");
List<Note> ls = q.list();
for(Note n:ls){
	%>
	
	<div class="card" style="width: 18rem;">
	  
	  <div class="card-body">
	    <h5 class="card-title"><%= n.getTitle() %></h5>
	    <p class="card-text"><%=n.getContent() %></p>
	    <a href="DeleteServlet?note_id=<%=n.getId()%>" class="btn btn-danger">Delete</a>
	     <a href="edit.jsp?note_id=<%=n.getId() %>" class="btn btn-primary">Update</a>
	  </div>
	</div>
	<%
}
s.close();
%>

 </div>
</div>


</div>

</body>
</html>