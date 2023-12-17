<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new building</title>
</head>
<body>
<div align="center"><h2 style="color: slateblue">Add new building</h2></div>
<div align="center">
    <form:form action="/createbuilding" method="post" modelAttribute="building">
        <table>
            <tr>
                <td>Developer id</td>
                <td><form:input path="developerId"/></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><form:input path="address"/></td>
            </tr>
            <tr>
                <td>Year</td>
                <td><form:input path="year"/></td>
            </tr>
            <tr>
                <td>Apartment</td>
                <td><form:input path="apartment"/></td>
            </tr>
            <tr>
                <td>Basement</td>
                <td><form:input path="basement"/></td>
            </tr>
            <tr>
                <td>
                    <button type="submit">Save</button>
                </td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
