<%--
  Created by IntelliJ IDEA.
  User: kennethhayles
  Date: 3/9/23
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
<c:if test="true">
    <h1>Variable names should be very descriptive</h1>
</c:if>
<c:if test="false">
    <h1>single letter variable names are good</h1>
</c:if>
</body>
</html>