package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_hw8")
public class StudentHW8 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "group_head")
    private boolean groupHead;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private GroupHW8 groupId;

    public StudentHW8() {
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getGroupHead() {
        return groupHead;
    }

    public void setGroupHead(boolean groupHead) {
        this.groupHead = groupHead;
    }

    public GroupHW8 getGroupId() {
        return groupId;
    }

    public void setGroupId(GroupHW8 groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudentHW8{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupHead='" + groupHead + '\'' +
                ", group_id=" + groupId +
                '}';
    }
}
