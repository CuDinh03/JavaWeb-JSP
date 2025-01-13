<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%@include file="formCreate.jsp"%>
<br>
<br>
<jsp:include page="formCreate.jsp">
    <jsp:param name="name" value="Dinh Huy Cu"/>
    <jsp:param name="age" value="23"/>
</jsp:include>
</body>
</html>