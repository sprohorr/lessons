<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All students</title>
</head>
<body>
<form:form action="/hello/showallstudentsgroup" method="get" modelAttribute="student">
<table>
    <tr>
        <td>Number group</td>
        <td><form:input path="groupId"/></td>
    </tr>
    <tr>
        <td>
            <button type="submit">Go</button>
        </td>
    </tr>
</table>
</form:form>
<a href="/hello/intro">Return to back</a>
<br>
</html>
