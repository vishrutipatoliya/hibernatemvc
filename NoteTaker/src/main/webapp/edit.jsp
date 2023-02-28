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
<title>Insert title here</title>
 <%@ include file="all_js_css.jsp" %>
</head>
<body>
<div class="container">
<%@include file="navbar.jsp" %>
<h1>edit page</h1>
<%
int noteId = Integer.parseInt(request.getParameter("note_id").trim());
Session s = FactoryProvider.getFactory().openSession();

Note n = (Note)s.get(Note.class, noteId);

%>
<form action="UpdateServlet" method="post">
<input value="<%=n.getId()%>" name="noteId" type="hidden">
  <div class="form-group">
    <label for="title">Note title</label>
    <input name="title" required type="text" value="<%=n.getTitle() %>"  class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here">
    
  </div>
  <div class="form-group">
    <label for="content">Note Content</label>
     <textarea name="content" id="content"  >  <%=n.getContent()%></textarea>
  </div>
  <div class="container text-center">

  <button type="submit" class="btn btn-success">Save your note</button>
    </div>
</form>
</div>

</body>
</html>