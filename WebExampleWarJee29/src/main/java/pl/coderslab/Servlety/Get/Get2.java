package pl.coderslab.Servlety.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Get2", value = "/get2") // do wklejenia na strone po /web -> get2?a=2&b=3&a=12
public class Get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        Map<String, String[]> parameterMap = request.getParameterMap();

        for (Map.Entry<String, String[]> param : parameterMap.entrySet()) {
            response.getWriter().println(
                    String.format("<div>%s : %s</div>",
                            param.getKey(),
                            Arrays.toString(param.getValue())
                    )
            );
        }
    }
}
