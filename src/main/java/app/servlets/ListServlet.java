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
import java.util.List;

public class ListServlet extends HttpServlet {

    private UserDAO userDAO;

    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = null;
        try {
            users = userDAO.selectAllUser();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String action = req.getServletPath();
        try {
            switch (action) {
                case "/edit":

                    break;
                default:
                    req.setAttribute("users", users);
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
                    requestDispatcher.forward(req, resp);
                    break;
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }


}
