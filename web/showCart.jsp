<%--
  Created by IntelliJ IDEA.
  User: KOTLIS
  Date: 28.05.2020
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <%@ page import="somePackage.Cart" %>


    <% somePackage.Cart cart = (Cart)session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName() %> </p>
    <p> Количество: <%= cart.getAmount() %> </p>

</body>
</html>
