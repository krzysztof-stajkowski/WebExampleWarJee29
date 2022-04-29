package pl.coderslab.Servlety.Get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//Zadanie 3
//
//  W projekcie stwórz servlet Get3, dostępny pod adresem /get3, który ma pobierać dwie zmienne o nazwach width i height.
//  Jeżeli informacje nie są przesłane to przyjmij, że:
//      width = 5 i height = 10.
//  Następnie wygeneruj tabliczkę mnożenia o podanej wysokości i szerokości i wyświetl ją w przeglądarce.

// PRZYKŁADOWE ODWOŁANIA -> /get3?width=3&height=3
@WebServlet(name = "get3", value = "/get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String widthStr = request.getParameter("width");
        String heightStr = request.getParameter("height");
        int width;
        int height;
        if (widthStr == null ){
            widthStr = "5";
        }
        if (heightStr == null){
            heightStr = "10";
        }
        try {
            width = Integer.parseInt(widthStr);
            height = Integer.parseInt(heightStr);
            for (int i = 1;i <= height ; i++){
                for (int j = 1; j <= width;j++){
                    int score = i * j;
                    response.getWriter().println(" " + score + " ");
                }
                response.getWriter().println("<br>");

            }
            return;
        }catch (NumberFormatException e){
            response.getWriter().println("Złe dane");
            return;
        }
    }
}