<%@ page import="java.util.List" %>
<%@ page import="app.entities.User" %><%--
  Created by IntelliJ IDEA.
  User: KOTLIS
  Date: 01.06.2020
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        table, th, td {
            border: 1px solid black;
            margin: 3px;
        }
    </style>
    <title>The List of Users</title>
</head>
<body>
    <div>
        <h1>List of users</h1>
    </div>

    <div>
        <div>
            <div>
            <h2>Users</h2>
            </div>
                <%
                    List<User> users = (List<User>)request.getAttribute("users");
                    List<String> names = (List<String>)request.getAttribute("userNames");

                    if (users != null && !users.isEmpty()) {
                        out.println("<table>");
                        out.println("<tr>");
                        out.println("<th>ID</th>");
                        out.println("<th>Name</th>");
                        out.println("<th>Email</th>");
                        out.println("<th>Country</th>");
                        out.println("</tr>");

                        for (User user : users) {
                            out.println("<tr>");
                            out.println("<td>" + user.getId() + "</td>");
                            out.println("<td>" + user.getName() + "</td>");
                            out.println("<td>" + user.getEmail() + "</td>");
                            out.println("<td>" + user.getCountry() + "</td>");
                            out.println("</tr>");
                        }

                        out.println("</table>");
                    } else {
                        out.println("<ul>");
                        out.println("<li> The List of users is empty! </li>");
                        out.println("</ul>");
                    }
                %>
        </div>
    </div>

    <div>
        <button style="margin: 3px" onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
