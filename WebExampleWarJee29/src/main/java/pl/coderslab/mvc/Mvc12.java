package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//DO WYWOŁANIA W WEB -> web/mvc12?start=12&end=30

@WebServlet(name = "Mvc12", value = "/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strartStr = request.getParameter("start");
        String endStr = request.getParameter("end");

        try {
            int start = Integer.parseInt(strartStr);
            int end = Integer.parseInt(endStr);
            start += 10;
            end += 10;
            request.setAttribute("start",start);
            request.setAttribute("end",end);
        } catch (NumberFormatException e) {
            System.out.println("niepoprawne");
        }


        getServletContext().getRequestDispatcher("/jsp2.jsp")
                .forward(request, response);

    }
}
