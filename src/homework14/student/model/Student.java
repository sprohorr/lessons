package homework14.student.model;


public class Student {
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    protected int course;
    private String name;
    private int group;

    public int getGrade() {
        return grade;
    }

    protected int grade;

    public Student(String name, int group, int course, int grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", grade=" + grade +
                '}';
    }
}
