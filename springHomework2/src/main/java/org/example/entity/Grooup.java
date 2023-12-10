package org.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "grooup")
public class Grooup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private int title;
    @Column(name = "room")
    private int room;

    public Grooup() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grooup grooup = (Grooup) o;
        return id == grooup.id && title == grooup.title && room == grooup.room;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, room);
    }

    @Override
    public String toString() {
        return "Grooup{" +
                "id=" + id +
                ", title=" + title +
                ", room=" + room +
                '}';
    }
}
