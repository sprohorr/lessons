package homework7.grants;

import java.util.Arrays;

public class Grants {
    protected String firstName;
    protected String lastName;
    protected int group;
    protected double averageMark;
    protected boolean scientificWork;

    public Grants(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Grants(String firstName, String lastName, int group, double averageMark, boolean scientificWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        this.scientificWork = scientificWork;
    }

    public String toString() {
        return "First name {" + firstName + "} Last name {" + lastName +
                "} Group [" + group + "] Average mark [" + averageMark +
                "] Scientific work [" + scientificWork + "] ";
    }
}

