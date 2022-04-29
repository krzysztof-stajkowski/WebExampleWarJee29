package pl.coderslab.mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc11", value = "/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String roleParamVal = request.getParameter("role");

        if (roleParamVal != null) {

            String role = "ROLE_" + roleParamVal.toUpperCase();
            request.setAttribute("userRole", role);
        }

        getServletContext().getRequestDispatcher("/jsp1.jsp")
                .forward(request, response);

        //web/mvc11?role=alamakota  -> wyświelti uppercase
        //web/mvc11?alamakota  -> wyświetli tak jak się wpisze
    }
}
