package app.servlets;

import app.entities.User;
import app.model.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class EditServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = null;

        try {
            user = UserDAO.getInstance().selectUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/edit.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User upUser = new User(id, name, email, country);

        try {
            UserDAO.getInstance().updateUser(upUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("list");
    }
}
