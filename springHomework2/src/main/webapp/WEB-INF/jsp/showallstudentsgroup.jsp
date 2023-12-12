<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<c:forEach var="student" items="${student}">
    <tr>
        <td>Name:${student.name}</td>
        <br/>
        <td>Age:${student.age}</td>
        <br/>
        <td>Group:${student.group.id}</td>
        <br/>
    </tr>
    <br>
</c:forEach>
<a href="/hello/intro">Return to intro</a>
</body>
</html>
