<%--
  Created by IntelliJ IDEA.
  User: KOTLIS
  Date: 01.06.2020
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styles/w3.css">
    <title>Add new User</title>
</head>
<body>
    <div>
        <h1>Adding new User</h1>
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
            <form method="post">
                <label>Name:
                    <input type="text" name="name"><br />
                </label>
                <label>Email
                    <input type="email" name="email"><br />
                </label>
                <label>Country
                    <input type="country" name="country"><br />
                </label>
                <button type="submit">Submit</button>
            </form>
        </div>
    </div>

    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
