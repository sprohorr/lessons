<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successfully!</title>
</head>
<body>
<h2>Student successfully created!</h2>
<c:out value="Number group: ${studentDTO.groupId}"></c:out><br/>
<c:out value="Name: ${studentDTO.name}"></c:out><br/>
<c:out value="Age: ${studentDTO.age}"></c:out><br/>
<a href="/hello/intro">Return to intro</a>
</body>
</html>
