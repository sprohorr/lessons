package homework14.student.model;


public class Student {
    protected static int course;
    private String name;
    private int group;
    protected static int grade;

    public Student(String name, int group, int course, int grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

}
