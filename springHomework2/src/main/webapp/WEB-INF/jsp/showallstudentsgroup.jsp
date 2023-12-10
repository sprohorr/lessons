<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>

<c:forEach var="list" items="${students}">
    ${list.name}
    ${list.age}
    ${list.groupid}
    <br>
</c:forEach>
<a href="/hello/intro">Return to intro</a>
</body>
</html>
