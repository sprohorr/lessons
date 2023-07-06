package homework7.grants;

public class Aspirant extends Student {
    private String firstName;
    private String lastName;
    private int group;
    private int averageMark;
    private int grantBase = 10;
    private int hightGrantAspirant = hightGrantStudent * 2;
    private boolean scientificWork;

    public Aspirant(String firstName, String lastName, int group, int averageMark, boolean scientificWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        this.scientificWork = scientificWork;
    }

    public int getGrantAmount() {
        int y;
        int sum2 = 0;
        if (averageMark >= 5) {
            y = hightGrantAspirant;
        } else {
            y = grantBase;
        }
        sum2 += y;
        return sum2;
    }

    public String toString() {
        return "First name {" + firstName + "} Last name {" + lastName +
                "} Group [" + group + "] Average mark [" + averageMark +
                "] Scientific work [" + scientificWork + "] ";
    }
}