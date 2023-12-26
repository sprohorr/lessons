<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit building</title>
</head>
<body>
<div align="center"><h2 style="color: slateblue">Add new building</h2></div>
<div align="center">
    <form:form action="/editbuilding?building.id=${building.id}" method="post" modelAttribute="building">
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
