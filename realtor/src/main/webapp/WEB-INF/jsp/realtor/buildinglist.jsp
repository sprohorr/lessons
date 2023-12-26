<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Building list</title>
</head>
<body style="background-color:lavender">
<div align="center" style="color: slateblue">
    <h3>${developer.name}</h3>
    <p>Email: ${developer.email}</p>
    <p>Director's name: ${developer.nameDirector}</p>
</div>
<hr/>
<div>
    <table border="2px">
        <h3 style="color: slateblue">Buildings this company:</h3>
        <c:forEach var="building" items="${building}">
            <tr>
                <td><p style="color: slateblue">Address: ${building.address}</p></td>
                <td><p style="color: slateblue">Year of construction: ${building.year}</p></td>
                <td><p style="color: slateblue">Number of apartments: ${building.apartments}</p></td>
                <td><p style="color: slateblue">Availability of a basement: ${building.basement}</p></td>
                <td><a style="color: slateblue" href="/editbuilding?building.id=${building.id}">Edit</a></td>
            </tr>
            <br/>
        </c:forEach>
    </table>
    <hr/>
    <a href="/createbuilding?developer.id=${developer.id}"><p style="color: slateblue">Add new building</p></a>
    <a href="/realtor/list"><p style="color: slateblue">Return to back</p></a>
</div>
</body>
</html>
