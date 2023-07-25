package homework13.serializableTask;

import java.io.Serializable;

public class Author implements Serializable {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
