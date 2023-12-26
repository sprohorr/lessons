package org.example.dto;

import java.util.Objects;

public class DeveloperDTO {
    private int id;
    private String name;
    private String email;
    private String nameDirector;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeveloperDTO that = (DeveloperDTO) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(nameDirector, that.nameDirector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, nameDirector);
    }
}
