<%--
  Created by IntelliJ IDEA.
  User: kif
  Date: 2019/2/15
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link  rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>" >
</head>
<body>
    <h1>Register</h1>
    <form method="post">
        First Name: <input type="text" name="firstName"><br/>
        Last Name: <input type="text" name="lastName"><br/>
        Username: <input type="text" name="username"><br/>
        Password: <input type="password" name="password"><br/>
        <input type="submit" value="Register">
    </form>
</body>
</html>
