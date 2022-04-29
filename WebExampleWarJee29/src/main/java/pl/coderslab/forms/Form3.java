package pl.coderslab.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form3", value = "/getForm3")   // nazwa adresu z małej litery!
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");  // bez tego formatu nie rozpozna <div> i nie wyrenderuje jako html jedno pod drugim
        response.setCharacterEncoding("UTF-8");

        String pageStr = request.getParameter("page");  // pobieranie parametrów z form html - z name

        if (pageStr == null) {
            response.getWriter().println("NIE PODANO PARAMETRU");
            return;
        }

        try {
            int pageInt = Integer.parseInt(pageStr);
            for (int i = 1; i <= pageInt; i++) {
                if (pageInt % i == 0) {
                    response.getWriter().println(String.format("<div>Podana liczba %s dzieli się przez %s</div>", pageInt, i));
                }
            }
        } catch (NumberFormatException e) {
            response.getWriter().println(String.format("Niepoprawne dane: %s", pageStr));
            return;
        }

    }
}