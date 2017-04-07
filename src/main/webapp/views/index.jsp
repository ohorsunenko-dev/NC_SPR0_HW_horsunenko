<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>HW project</title>
</head>
<body>
    <h1>HW Project!</h1>

        <div align="center">
        <h2>About</h2>
        <c:out value="${id}"></c:out></h3>
        <p><c:out value="Last name: " /><c:out value="${lastName}" /> </p>
        <p><c:out value="First name:" /><c:out value="${firstName}" /></p>
        <p><c:out value="Comment: " /><c:out value="${comment}" /></p>
        </div>


</body>
</html>
