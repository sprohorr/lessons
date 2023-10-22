package org.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group_hw8")
public class GroupHW8 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "groupId")
    private List<StudentHW8> students;

    public GroupHW8() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<StudentHW8> getStudents() {
        return students;
    }

    public void setStudents(List<StudentHW8> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "GroupHW8{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
