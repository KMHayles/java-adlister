<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: kennethhayles
  Date: 3/9/23
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String method = request.getMethod();

    if (method.equals("POST")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (Objects.equals(username, "admin") && Objects.equals(password, "password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Login Form</h1>

<%@ include file="/partials/navbar.jsp" %>

<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username">

    <label for="password">Password:</label>
    <input type="password" id="password" name="password">
    <button>Login</button>
</form>

<%@ include file="/partials/footer.jsp" %>

</body>
</html>
