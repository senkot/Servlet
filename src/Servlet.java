import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        printWriter.println("<title>");
        printWriter.println("Servlet!");
        printWriter.println("</title>");
        printWriter.println("<h1> Hello, " + name + "! Mr. " + lastName + ", greetings! </h1>");
        printWriter.println("<p style='size:5px; background-color: lightblue; text-align: center; color: green;'> this is Tomcat-response </p>");
        printWriter.println("</html>");
    }
}
