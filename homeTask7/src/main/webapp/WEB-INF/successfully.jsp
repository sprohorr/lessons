<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Successfully</title>
</head>
<body>
<form method="get">
    <div>
        <h1>Application successfully saved!</h1>
    </div>
    <div>
        <p>Number of applications: ${resultSet}</p>
    </div>
    <div>
        <a href="/list">Show list</a>
    </div>
</form>
</body>
</html>