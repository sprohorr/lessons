package homework14.student;


import homework14.student.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentCourseService {
    public static List<Student> students = new ArrayList<>();

    public static void upgradeCourse(List<Student> students) {
//        for (Student student : students) {
//            if (student.getGrade() >= 3) {
//                student.setCourse(student.getCourse() + 1);
//                System.out.println("Student enrolled in the next course");
//            } else {
//                System.out.println("REMOVED");
//                students.remove(student);
//                System.out.println("Student expelled");
//            }
//        }

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
                System.out.println("Student enrolled in the next course");
            } else {
                it.remove();
                System.out.println("Student expelled");
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student el : students) {
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
