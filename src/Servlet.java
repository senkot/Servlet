import somePackage.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        Cart cart = (Cart)session.getAttribute("cart");

        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));

        if(cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setAmount(amount);
        }

        session.setAttribute("cart", cart);



//        PrintWriter printWriter = response.getWriter();
//        printWriter.println("<html>");
//        printWriter.println("<title>");
//        printWriter.println("Servlet!");
//        printWriter.println("</title>");
//        printWriter.println("<h1> Your count is : " + count + " </h1>");
//        printWriter.println("<p style='size:5px; background-color: lightblue; text-align: right; color: green;'> this is Tomcat-response </p>");
//        printWriter.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);

    }
}
