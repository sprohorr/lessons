<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new building</title>
</head>
<body style="background-color: lavender">
<div align="center"><h2 style="color: slateblue">Add new building</h2></div>
<div align="center" style="color: slateblue">
    <h3>${developer.name}</h3>
</div>
<div align="center">
    <form:form action="/createbuilding?developer.id=${developer.id}" method="post" modelAttribute="building">
        <table>
            <tr>
                <td><form:input path="address"/>Address</td>
            </tr>
            <tr>
                <td><form:input path="year"/>Year</td>
            </tr>
            <tr>
                <td><form:input path="apartments"/>Apartments</td>
            </tr>
            <tr>
                <td><p>Basement</p>
                    <div>
                        <p>Yes</p><form:radiobutton value="1" path="basement"/>
                        <p>No </p><form:radiobutton value="0" path="basement"/>
                    </div>
                </td>
            </tr>
        </table>
        <button type="submit">Save</button>
    </form:form>
</div>
</body>
</html>
