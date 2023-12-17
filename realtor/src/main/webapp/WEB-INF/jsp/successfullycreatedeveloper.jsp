<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successfully create</title>
</head>
<body>
<div align="center">
    <c:out value="Name company:${developer.name}"></c:out><br/>
    <c:out value="Email:${developer.email}"></c:out><br/>
    <c:out value="Director's name:${developer.nameDirector}"></c:out><br/>
</div>
<a href="/realtor/list">Return to the list of developers</a>
</body>
</html>
