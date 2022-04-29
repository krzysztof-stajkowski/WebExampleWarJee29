package pl.coderslab.Servlety;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/first")  // teraz z tym można uruchomić stronę dopisując w przeglądarce do \web\first
// i uruchiamia się poniższa metoda
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("hello first servlet");

    }
}



