package pl.coderslab.Servlety;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// TUTAJ NIE MA :
// @WebServlet("/servlet12")
//PONIEWAŻ ZASTOSOWANY JEST POKAZOWO web.xml W KTÓRYM SĄ ZAPISANE ODPOWIEDNIE DANE - TEGO SIĘ JUŻ TAK NIE ROBI
public class Servlet12 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException {

        resp.getWriter().println("Content 12");
    }
}
