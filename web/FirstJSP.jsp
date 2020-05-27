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
        <%@ page import="java.util.Date, logic.TestClass" %>

        <%
            TestClass testClass = new TestClass();
        %>

        <%=
            testClass.getInfo()
        %>

        <%=
            new Date()
        %>

        <%
            for(int i = 0; i < 10; i++){
                out.println("<p style='color: darkred; background-color: aquamarine; text-align: center; width: 75px;'>"
                        + "Hello : " + (i + 1) + "</p>");
            }
        %>
    </p>
</body>
</html>
