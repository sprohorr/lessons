package homework13.serializableTask;

import java.io.*;

public class SerializableRunner {
    public static void main(String[] args) throws IOException {
        Author author = new Author("Антон", "Петряков");
        Book book = new Book("Быть нельзя казаться", "304", author);

        writeSerializedBook(book);
        System.out.println(book);
        Book deserializedStudent = readDeserializedBook();
        System.out.println(deserializedStudent);
    }

    private static Book readDeserializedBook() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (Book) input.readObject();
        } catch (IOException e) {
            System.out.println("Cannot read to file " + e.getClass().getName() + " " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find class " + e.getClass().getName() + " " + e.getMessage());
        }
        return null;
    }

    private static void writeSerializedBook(Book book) {
        try (FileOutputStream fos = new FileOutputStream(FILENAME);
             ObjectOutputStream output = new ObjectOutputStream(fos)) {
            output.writeObject(book);
        } catch (IOException e) {
            System.out.println("Cannot write to file " + e.getClass().getName() + " " + e.getMessage());
        }
    }

    private static final String FILENAME = "C:\\Users\\User\\IdeaProjects\\lessons\\src\\homework13\\textFile.txt";
}
