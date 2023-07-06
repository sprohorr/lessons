package homework7.grants;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private int averageMark;
    private int grantBase = 10;
    protected int hightGrantStudent = 50;

    public Student(String firstName, String lastName, int group, int averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {

    }

    public int getGrantAmount() {
        int x = 0;
        int sum = 0;

        if (averageMark >= 5) {
            x = hightGrantStudent;
        } else {
            x = grantBase;
        }
        sum += x;
        return sum;
    }


    public String toString() {
        return "First name {" + firstName + "} Last name {" + lastName +
                "} Group [" + group + "] Average mark [" + averageMark + "] ";
    }
}
