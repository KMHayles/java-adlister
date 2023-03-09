<%--
  Created by IntelliJ IDEA.
  User: kennethhayles
  Date: 3/9/23
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String foodType = request.getParameter("food");
    request.setAttribute("foodType", foodType);

%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Foods</title>
</head>
<body>
    <h1>Food Type: ${foodType}</h1>
</body>
</html>
