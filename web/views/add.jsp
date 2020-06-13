<%--
  Created by IntelliJ IDEA.
  User: KOTLIS
  Date: 01.06.2020
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="styles/w3.css">
    <title>Add new User</title>
</head>
<body>
    <div>
        <h1>
            <c:if test="${user != null}">
            Edit User
            </c:if>
            <c:if test="${user == null}">
            Adding New User
            </c:if>
                </h1>
    </div>
    <div>
        <%
            if (request.getAttribute("userName") != null) {
                out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
            }
        %>
        <div>
            <div>
                <h2>Add user:</h2>
            </div>
            <c:if test="${user != null}">
                <form action="update" method="post">

                    </c:if>
                        <c:if test="${user == null}">
                        <form action="insert" method="post">

                            </c:if>
                <label>Name:
                    <input type="text" name="name" value=""><br />
                </label>
                <label>Email
                    <input type="email" name="email"><br />
                </label>
                <label>Country
                    <input type="country" name="country"><br />
                </label>
                <button type="submit">Add</button>
            </form>
        </div>
    </div>

    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
