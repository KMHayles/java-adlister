<%--
  Created by IntelliJ IDEA.
  User: kennethhayles
  Date: 3/9/23
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food Order</title>
</head>
<body>

<h1>Food Order Form</h1>
<form action="/foods.jsp">
  <select name="food" id="food">
    <option value="Dairy">Dairy</option>
    <option value="Meat">Meat</option>
  </select>
  <button>Submit</button>
</form>

</body>
</html>