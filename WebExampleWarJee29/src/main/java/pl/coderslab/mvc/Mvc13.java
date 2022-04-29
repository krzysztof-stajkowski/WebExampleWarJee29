package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//W projekcie stwórz servlet Mvc13 dostępny pod adresem /mvc13.
//
//        W widoku jsp3.jsp stwórz formularz zawierający pola o nazwach: title, author i isbn. Formularz ma przesłać dane metodą POST do tego samego servletu (do metody doPost).
//        Stwórz klasę Book zawierającą pola zgodne z polami wcześniej utworzonego formularza.
//        Odbierz dane i na ich podstawie stwórz obiekt klasy Book.
//        Przekaż obiekt do widoku result.jsp.
//        Wyświetl właściwości nowo dodanego obiektu: title, author, isbn.

//DO WYWOŁANIA W WEB -> http://localhost:8080/web/jsp3.jsp

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");

        Book book = new Book(title,author,isbn);
        request.setAttribute("book",book);
        request.getServletContext().getRequestDispatcher("/result.jsp").forward(request,response);
    }

}