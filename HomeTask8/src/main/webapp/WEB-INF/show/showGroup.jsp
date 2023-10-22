<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show Group</title>
</head>
<body>
<table>
    <c:forEach var="table" items="${groups}">
        <tr>
            <td>${table.id}</td>
            <td>${table.title}</td>
        </tr>
    </c:forEach>
</table>
<a href="/addGroup">Return to back</a>
</body>
</html>