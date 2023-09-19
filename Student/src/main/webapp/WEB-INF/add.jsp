<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 19.09.2023
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add</title>
</head>
<body>
<div>
  <%
    if (request.getAttribute("student") != null) {
      out.println("<p>Student '" + request.getAttribute("student") + "' added!</p>");
    }
  %>
  <div>
    <form method="post">
      <label>Name:
        <input type="text" name="name"><br/>
      </label>
      <label>Surname:
        <input type="text" name="surname"><br/>
      </label>
      <label>Age:
        <input type="number" name="age"><br/>
      </label>
      <input type="checkbox" checked><label>Overwrite file</label><br>
      <input type="checkbox"><label>Append to end of file</label><br>
      <button type="submit">Submit</button>
    </form>
  </div>
</div>
<div>
  <button onclick="location.href = '/app'">Back to main</button>
</div>
</body>
</html>
