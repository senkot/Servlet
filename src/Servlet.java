import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        printWriter.println("<h1> Hello, World! </h1>");
        printWriter.println("<p style='background-color: lightblue; text-align: center; color: green;'> this is Tomcat-response </p>");
        printWriter.println("</html>");
    }
}
