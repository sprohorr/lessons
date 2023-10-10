<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show list</title>
</head>
<body>
<form method="get" action="/list">
    <table>
        <c:forEach var="table" items="${tableList}">
            <tr>
                <td>${table.name}</td>
                <td>${table.date}</td>
                <td>${table.description}</td>
            </tr>
        </c:forEach>
    </table>

    <a href="/app">Back to main menu</a>
</form>
</body>
</html>
