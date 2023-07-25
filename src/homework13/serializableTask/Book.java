package homework13.serializableTask;

import java.io.Serializable;

public class Book implements Serializable {
    private String nameBook;
    private Author name;
    private Author surname;
    private int numberOfPages;

    public Book(String nameBook, String numberOfPages, Author author) {
        this.nameBook = nameBook;
        this.numberOfPages = Integer.parseInt(numberOfPages);
    }
}
