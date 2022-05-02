package pl.coderslab.filter.zad1;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//Zadanie 1 - rozwiązywane z wykładowcą
//
//        Utwórz filtr, który będzie ustawiał kodowanie dla obiektu żądania i odpowiedzi na utf-8.

@WebFilter("/*")
public class UTF8Filter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("filter: set UTF-8 encoding");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json"); //TO MUSI BYĆ INACZEJ NIE ZŁAPIE UTF i FORMATOWANIA POPRAWNEGO NA STRONIE
        chain.doFilter(request, response);
    }
}