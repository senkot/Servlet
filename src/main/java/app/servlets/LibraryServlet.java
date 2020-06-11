package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test_db?useUnicode=true&serverTimezone=UTC", "root", "123456");

            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT title FROM books");

            while(rs.next()) {
                pw.println(rs.getString("title"));
            }

            statement.close();
            connect.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}