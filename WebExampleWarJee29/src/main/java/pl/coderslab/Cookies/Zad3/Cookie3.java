package pl.coderslab.Cookies.Zad3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie3") //COOKIES WYWOŁUJEMY PRZEZ nazwę z html np. cookie3.html
public class Cookie3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        String time = request.getParameter("time");

        if (key == null || value == null
                || key.length() < 1 || value.length() < 1
                || time == null) {
            response.getWriter().println(String.format("Niepoprawne dane: %s, %s %s", key, value, time));
            return;
        }
        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");
        cookie.setMaxAge(Integer.parseInt(time) * 60 * 60); // TRZEBA tu robić rzutowanie bo getParameter jest zawsze Stringiem

        response.addCookie(cookie);
        response.getWriter().println(String.format("Dodano ciasteczko: %s=%s", key, value, time));
    }
}

