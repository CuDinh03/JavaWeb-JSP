<%--
  Created by IntelliJ IDEA.
  User: maccuacu
  Date: 11/1/25
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${message}</h1>
<h2>${now.date}</h2>
<h2>${message}</h2>
<jsp:include page="/lab2/user-info.jsp"/>
<jsp:include page="/lab2/form.jsp"/>
</body>
</html>
