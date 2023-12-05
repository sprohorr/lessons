<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students list</title>
</head>
<body>
<table>
    <c:forEach var="list" items="${students}">
        <tr>
            <td>${list.name}</td>
            <td>${list.surname}</td>
            <td>${list.groupHead}</td>
        </tr>
        <br/>
    </c:forEach>
</table>
<a href="/search">Return to back</a>
</body>
</html>
