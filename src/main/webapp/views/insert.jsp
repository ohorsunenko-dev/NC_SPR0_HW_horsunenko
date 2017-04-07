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
            <h1>New Info</h1>
            <form:form action="insertInfo" method="post" modelAttribute="Info">
            <table>
                <form/>
                <tr>
                    <td>Id:</td>
                    <td><form:input path="id" /></td>
                </tr>
                <tr>
                <td>Last Name:</td>
                <td><form:input path="lastName" /></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><form:input path="firstName" /></td>
                </tr>
                <tr>
                    <td>Comment:</td>
                    <td><form:input path="comment" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save"></td>
                </tr>
            </table>
            </form:form>
        </div>

</body>
</html>
