<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit developer</title>
</head>
<body style="background-color: lavender">
<div><h2 align="center" style="color: slateblue">Edit developer</h2></div>
<div align="center">
    <form:form action="${pageContext.request.contextPath}/editdeveloper?developer.id=${developer.id}" method="post"
               modelAttribute="developer">
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
                    <button type="submit">Edit</button>
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
</div>
</body>
</html>
