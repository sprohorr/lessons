package homework14.student.model;

import java.util.ArrayList;
import java.util.List;

import static homework14.student.model.Student.course;
import static homework14.student.model.Student.grade;

public class StudentCourseService {
    public static List<String> students = new ArrayList<>();

    public static void upgradeCourse(List<String> students) {
        if (grade >= 3) {
            course++;
            System.out.println("Student enrolled in the next course");
        } else {
            students.remove(students);
            System.out.println("Student expelled");
        }
    }

    public static void printStudents(List<String> students, int course) {
        for (String el : students) {
            System.out.println("Students " + el + " Course: " + course);
        }
    }
}
/* Создать класс Student, содержащий следующие характеристики:
        имя, группа, курс, оценки по предметам.
        Создать коллекцию, содержащую объекты класса Student.
        Cоздать класс StudentCourseService и методы:
        - метод upgradeCourse(List<Student> students),
        который удаляет студентов со средним баллом <3,
        а если средний балл>=3, студент переводится на следующий курс.
        - метод  printStudents(List<Student> students, int course),
        который печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.

    */
