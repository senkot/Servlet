package app.servlets;

import app.model.UserDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class DeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        try {
            UserDAO.getInstance().deleteUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        resp.sendRedirect("list");
    }
}
