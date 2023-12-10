<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form:form action="/test" method="post" modelAttribute="calculator">
    <table>
        <tr>
            <td>First number</td>
            <td><form:input path="operandFirst"/></td>
        </tr>
        <tr>
            <td>Operator</td>
            <td><form:input path="operator"/></td>
        </tr>
        <tr>
            <td>Second number</td>
            <td><form:input path="operandSecond"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Equals</button>
            </td>
        </tr>
    </table>
</form:form>

<c:out value="Result: ${calculator.result}"/>
</body>
</html>