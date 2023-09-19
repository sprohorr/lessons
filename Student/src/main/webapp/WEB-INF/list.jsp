<%@ page import="org.example.entities.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.09.2023
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<ul>
    <%
        List<Student> studentList = (List<Student>) request.getAttribute("student");
        if (studentList != null && !studentList.isEmpty()) {
            for (Student s : studentList) {
                out.println("<li><h2>" + s + "</h2></li>");
            }
            out.println("</ui>");
        } else out.println("<h1>There are no students yet!</h1>");
    %>
</ul>
<div>
    <button onclick="location.href = '/app'">Back to main</button>
</div>
</body>
</html>
