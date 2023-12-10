<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create group</title>
</head>
<body>
<form:form action="/hello/addgroup" method="post" modelAttribute="group">
    <table>
        <tr>
            <td>Number group</td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>Title</td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td>Room</td>
            <td><form:input path="room"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Go</button>
            </td>
        </tr>
    </table>
</form:form>
<br/>
<a href="/hello/intro">Return to back</a>
</body>
</html>
