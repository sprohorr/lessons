<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Developer</title>
</head>
<body>
<div><h2 style="color: slateblue">Add new developer</h2></div>
<div align="center">
    <form:form action="/createdeveloper" method="post" modelAttribute="developer">
        <table>
            <tr>
                <td>Name</td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><form:input path="email"/></td>
            </tr>
            <tr>
                <td>Name director</td>
                <td><form:input path="nameDirector"/></td>
            </tr>
            <tr>
                <td>
                    <button type="submit">Create</button>
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
</div>
</body>
</html>
