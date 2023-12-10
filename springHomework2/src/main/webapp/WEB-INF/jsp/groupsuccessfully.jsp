<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successfully!</title>
</head>
<body>
<h2>Group successfully created!</h2>
<c:out value="Number group: ${groupDTO.id}"></c:out><br/>
<c:out value="Title: ${groupDTO.title}"></c:out><br/>
<c:out value="Room: ${groupDTO.room}"></c:out><br/>
<a href="/hello/intro">Return to intro</a><br/>
<a href="/hello/addgroup">Add group</a><br/>
</body>
</html>
