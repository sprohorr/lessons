<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Building list</title>
</head>
<body>
<div style="color: slateblue">
    <h2>Name company ${developer.name}</h2>
    <h2>Email ${developer.email}</h2>
    <h2>Director's name ${developer.nameDirector}</h2>
    <a href="/createbuilding">Add new building</a>
</div>
<div>
    <h2>Building this company</h2>
    <table>
        <c:forEach var="building" items="${building}">
            <tr>
                <td>${building.id}</td>
                <td>${building.address}</td>
                <td>${building.year}</td>
                <td>${building.apartment}</td>
                <td>${building.basement}</td>
            </tr>
            <br/>
        </c:forEach>
    </table>
    <a href="/realtor/list">Return to back</a>
</div>
</body>
</html>
