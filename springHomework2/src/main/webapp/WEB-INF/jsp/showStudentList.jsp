<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<c:out value="Number group: ${grooup.numberGroup}"></c:out>
<br/>
<p>Student:</p>
<c:out value="Name: ${student.name}"></c:out><br/>
<c:out value="Surname: ${student.surname}"></c:out><br/>
<c:out value="Age: ${student.age}"></c:out>

</body>
</html>
