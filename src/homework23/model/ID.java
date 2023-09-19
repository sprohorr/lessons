package homework23.model;

import java.util.Objects;

public class ID implements Cloneable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID id1 = (ID) o;
        return id == id1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public ID clone() {
        try {
            ID newId = (ID) super.clone();
            return newId;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
