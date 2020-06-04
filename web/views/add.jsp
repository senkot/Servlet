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
<body class="w3-light-grey">
    <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
        <h1>Adding new User</h1>
    </div>
    <div class="w3-container w3-padding">
        <%
            if (request.getAttribute("userName") != null) {
                out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
            }
        %>
        <div class="w3-card-4">
            <div class="w3-container w3-center w3-green">
                <h2>Add user:</h2>
            </div>
            <form method="post" class="w3-selection w3-light-grey w3-padding">
                <label>Name:
                    <input type="text" name="name" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                </label>
                <label>Password
                    <input type="password" name="pass" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                </label>
                <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Submit</button>
            </form>
        </div>
    </div>

    <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
        <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
