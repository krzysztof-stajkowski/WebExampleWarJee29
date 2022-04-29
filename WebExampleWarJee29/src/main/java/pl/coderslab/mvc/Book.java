package pl.coderslab.mvc;

public class Book {

    private String title;
    private String author;
    private String isbn;

    //GETTERY I SETTERY MUSZĄ BYĆ NAWET GDY SĄ WYSZARZONE
    // JSP BEDZIE ICH WYMAGAŁ

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

