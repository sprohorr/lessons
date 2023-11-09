package org.example;

public class StudentDTO {
    private String name;
    private String surname;
    private int age;
    private int grooup;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrooup() {
        return grooup;
    }

    public void setGrooup(int grooup) {
        this.grooup = grooup;
    }

    @Override
    public String toString() {
        return "Student " + "\n" +
                " name: " + name + "\n" +
                ", surname: " + surname + "\n" +
                ", age:" + age + "\n" +
                " Group " + "\n" +
                " number group:" + grooup;
    }
}
