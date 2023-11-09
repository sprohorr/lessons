<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form:form action="/hello/add" method="post" modelAttribute="student">
    <table>
        <tr>
            <td>Number group</td>
            <td><form:input path="grooup"/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Surname</td>
            <td><form:input path="surname"/></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Go</button>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
