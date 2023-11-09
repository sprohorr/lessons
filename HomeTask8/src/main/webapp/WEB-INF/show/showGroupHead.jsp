<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Group head</title>
</head>
<body>
<c:forEach var="gr" items="${groupH}">
    <tr>
        <td>${gr.title}</td>
    </tr>
</c:forEach><br/>
<c:forEach var="head" items="${groupHead}">
    <tr>
        <td>${head.name}</td>
        <td>${head.surname}</td>
    </tr>
</c:forEach><br/>
<a href="/groupHead">Return to back</a>
</body>
</html>
