package pl.coderslab.Servlety;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/servlet14")
public class Servlet14 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException {


            String ipAddress = request.getHeader("X-FORWARDED-FOR");
            if (ipAddress==null){
                ipAddress = request.getLocalAddr();
                resp.getWriter().println("Adress ip: " + ipAddress);
            }

        String userAgent = request.getHeader("user-agent");
        resp.getWriter().println("Browser: " +userAgent);
    }
}
