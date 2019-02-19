<%--
  Created by IntelliJ IDEA.
  User: kif
  Date: 2019/2/19
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        span.error{
            /*color: red;*/
            background-color: #ffcccc;
            border: 2px solid red;
        }
        input.error{
            color: red;
        }
    </style>
</head>
<body>
    <h1>Register</h1>
    <%--<sf:form method="post" commandName="spitter" action="/spitter/register">--%>
    <sf:form method="post" modelAttribute="spitter" action="/spitter/register">
        <sf:label path="firstName" cssErrorClass="errot">First Name:</sf:label>
            <sf:input path="firstName"/>
            <sf:errors path="firstName" cssClass="error"/><br/>
        Last Name: <sf:input path="lastName"/>
            <sf:errors path="lastName" cssClass="error"/><br/>
        Username: <sf:input path="username"/>
            <sf:errors path="username" cssClass="error"/><br/>
        Password: <sf:input path="password"/>
            <sf:errors path="password" cssClass="error"/><br/>
        <input type="submit" value="Register">
    </sf:form>
</body>
</html>
