package homework14.student;

import homework14.student.model.Student;

import java.util.ArrayList;
import java.util.List;

import static homework14.student.StudentCourseService.printStudents;
import static homework14.student.StudentCourseService.upgradeCourse;

public class StudentRunner {

    public static void main(String[] args) {

        Student student1 = new Student("Ivanov V.V.", 1, 1, 2);
        Student student2 = new Student("Petrov P.P.", 1, 1, 3);
        Student student3 = new Student("Sidorov S.S.", 1, 1, 3);
        Student student4 = new Student("Sokolov S.S.", 1, 1, 5);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        upgradeCourse(students);
        upgradeCourse(students);
        printStudents(students, 2);
    }
}
