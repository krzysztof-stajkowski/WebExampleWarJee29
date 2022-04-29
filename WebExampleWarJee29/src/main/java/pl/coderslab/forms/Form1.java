package pl.coderslab.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form1", value = "/post1") // ABY WYWOŁAĆ FORMULARZ NALEŻY WPISAĆ CAŁĄ NAZWĘ
                                              // form1.html
                                              // form2.html
public class Form1 extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().println("odpowiadam ignorujac to co mi wyslales");
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String responseText = String.format("Witaj, %s %s", firstName, lastName);
        response.getWriter().println(responseText);
    }
}
