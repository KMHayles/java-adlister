<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Product" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: kennethhayles
  Date: 3/10/23
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

    Product p1 = new Product("Skateboard", 65.99);
    Product p2 = new Product("Rollerblade", 99.99);
    Product p3 = new Product("Road bicycle", 899.00);

    List<Product> products = new ArrayList<>(Arrays.asList(
            p1,
            p2,
            p3
    ));

    request.setAttribute("products", products);
%>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <h1>Products</h1>

<%--    <c:forEach var="products" items="${products}">--%>
<%--        <h3>--%>
<%--            <li>${products.productName} - cost $${products.cost}</li>--%>
<%--        </h3>--%>
<%--    </c:forEach>--%>

        <c:forEach var="products" items="${products}">
            <div>
                <h3>${products.productName} - <strong style="color: red">COST</strong> $${String.format("%.2f", products.cost)}</h3>
            </div>
        </c:forEach>

</body>
</html>
