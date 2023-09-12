package homework23.model;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private ID id;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public User clone() {
        try {
            User newUser = (User) super.clone();
            newUser.id = id.clone();
            return newUser;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
