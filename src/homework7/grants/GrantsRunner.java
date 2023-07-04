package homework7.grants;

import java.util.Arrays;

public class GrantsRunner {
    /*
    В классах Student и Aspirant используется принцип "Наследование",
    "Инкапсуляция" ограничевает доступ к переменным в полях класса,а также к объектам student и aspirant.
     */
    protected static Grants student = new Student();
    protected static Grants aspirant = new Aspirant();

    public static void main(String[] args) {
        System.out.println(student.toString());
        System.out.println(aspirant.toString());

        double grantsBase = 10;
        double x = 0;
        double y = 0;
        double sum = 0;
        Grants[] students = new Grants[]{student, aspirant};
        for (int i = 0; i < students.length; i++) {
            if (student.averageMark == 5) {
                x = grantsBase * 5;
            }
            if (aspirant.averageMark == 5) {
                y = grantsBase * 10;
            } else {
                sum = grantsBase;
            }
            sum = x + y;

        }
        System.out.println("Grants amount for all students: " + sum);


    }
}
