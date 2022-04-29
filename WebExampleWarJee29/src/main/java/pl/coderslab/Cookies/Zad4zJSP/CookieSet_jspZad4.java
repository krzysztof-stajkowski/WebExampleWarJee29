package pl.coderslab.Cookies.Zad4zJSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setCookieJSP")
public class CookieSet_jspZad4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("foo", "bar");
        cookie.setPath("/");
        cookie.setMaxAge(10000); // TO JEST BARDZO WAŻNE BO COOKIES MI ZGASŁY I NIE MOGŁEM ICH WYWOŁAĆ W JSP

        response.addCookie(cookie); //DODAJE cookie

    }
}