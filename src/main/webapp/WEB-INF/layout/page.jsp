<%--
  Created by IntelliJ IDEA.
  User: kif
  Date: 2019/2/19
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false"%>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style.css"/>">
</head>
<body>
    <%-- 插入头部 --%>
    <div id="header">
        <t:insertAttribute name="header"/>
    </div>

    <%-- 插入主体内容 --%>
    <div id="content">
        <t:insertAttribute name="body"/>
    </div>

    <%-- 插入底部 --%>
    <div id="footer">
        <t:insertAttribute name="footer"/>
    </div>
</body>
</html>
