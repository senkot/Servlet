<%--
  Created by IntelliJ IDEA.
  User: KOTLIS
  Date: 26.05.2020
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            String name = request.getParameter("name");
        %>

        <%= "Hello, " + name + "!" %>
    </p>
</body>
</html>
