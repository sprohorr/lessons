package homework9.library;


public class LibraryRunner {
    public static void main(String[] args) {
        Reader reader1 = new Reader("ivanov", "ivan", "ivanovich", 123);
        Reader reader2 = new Reader("petrov", "vasilii", "vasilevich", 124);
        Reader[] readers = {reader1, reader2};

        Book book1 = new Book("приключение", "верн");
        Book book2 = new Book("энциклопедия", "xxx");
        Book book3 = new Book("словарь", "даль");
        Book[] books1 = {book1, book3};
        Book[] books2 = {book2};
        readers[0] = new Reader();
        readers[1] = new Reader();

        reader1.takeBook(3);
        reader1.takeBook("приключение", "словарь");
        reader1.takeBook(books1);
        reader1.counterBook();
        reader2.takeBook("словарь");
        reader2.takeBook(1);
        reader2.counterBook();

    }
}


