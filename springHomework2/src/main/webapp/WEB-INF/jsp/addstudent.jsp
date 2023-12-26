<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form:form action="/hello/addstudent" method="post" modelAttribute="student">
    <table>
        <tr>
            <td>Number group</td>
            <td><form:input path="groupId"/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
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
<br/>
<a href="/hello/intro">Return to back</a>

</body>
</html>
