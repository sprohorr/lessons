package org.example.model;

import org.example.entities.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model studentModel = new Model();
    private List<Student> studentList;

    public static Model getStudentModel() {
        return studentModel;
    }

    private Model() {
        studentList = new ArrayList<>();
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public List<Student> list() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getSurname).thenComparing(Student::getAge))
                .collect(Collectors.toList());
    }
}
