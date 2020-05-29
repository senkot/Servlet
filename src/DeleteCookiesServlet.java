import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", "");

        cookie.setMaxAge(0);  //перезапись существующие куки с ключом some_id со сроком жизни 0 секунду, что удалит эти куки
//        cookie.setMaxAge(0);         - в этом случае куки удалятся при закрытии браузера

        response.addCookie(cookie); //здесь происходит запись новых куки



    }
}
