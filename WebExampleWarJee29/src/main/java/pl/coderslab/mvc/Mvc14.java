package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//Zadanie 4
//
//        W projekcie stwórz servlet Mvc14 dostępny pod adresem /mvc14.
//
//        W metodzie doGet utwórz listę obiektów klasy Book: List<Book>.
//        Dodaj kilka dowolnych obiektów do listy, a następnie przekaż do widoku resultList.jsp.
//        W pętli wyświetl właściwości wszystkich obiektów title, author, isbn.

//W TYM ZADANIU W PRZEGLĄDARKĘ WPROWADZAMY /mvc14
@WebServlet(name = "Mvc14", value = "/mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Book> books =
                Arrays.asList(
                        new Book("Książka 1", "Author 1", "1378hj387"),
                        new Book("Książka 2", "Author 2", "028752828"),
                        new Book("Książka 3", "Author 3", "5686sff499"));

        // PROPOZYCJA RAFAŁA MIMO TEGO ŻE W PDF JEST Arrays.asList(
//        List<Book> books = List.of(          // lepsza niz Arrays.asList
//                new Book("Kicia kocia w IT", "Anna Kocinska", "1231231"),
//                new Book("Zemsta", "Aleksander Fredro", "4646848"),
//                new Book("Quo Vadis", "Henryk Sienkiewicz", "2133122222"));


        request.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/result.jsp")
                .forward(request, response);

    }
}
