package pl.coderslab.Servlety;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet11")
public class Servlet11 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException {

        resp.getWriter().println("Content11");
        System.out.println("Hello First Servlet");
    }
}