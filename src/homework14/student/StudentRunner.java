package homework14.student;

import homework14.student.model.Student;

import static homework14.student.model.StudentCourseService.*;

public class StudentRunner {

    public static void main(String[] args) {

        Student student1 = new Student("Ivanov V.V.", 1, 1, 2);
        Student student2 = new Student("Petrov P.P.", 1, 1, 2);
        Student student3 = new Student("Sidorov S.S.", 1, 1, 3);
        Student student4 = new Student("Sokolov S.S.", 1, 1, 5);
        students.add(String.valueOf(student1));
        upgradeCourse(students);
        students.add(String.valueOf(student3));
        upgradeCourse(students);
        printStudents(students, 2);
    }
}
