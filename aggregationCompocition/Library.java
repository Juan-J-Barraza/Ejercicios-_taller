package aggregationCompocition;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println("the book is: " + book.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    
}
