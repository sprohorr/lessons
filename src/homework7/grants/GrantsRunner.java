package homework7.grants;

public class GrantsRunner {
    /*
    В классах Student и Aspirant используется принцип "Наследование",
    "Инкапсуляция" ограничевает доступ к переменным в полях класса,а также к объектам student и aspirant.
     */
    public static void main(String[] args) {
        Student student = new Student("ivan", "ivanov", 1, 4);
        Student aspirant = new Aspirant("victor", "petrov", 2, 4, true);
        System.out.println(student);
        System.out.println(aspirant);

        int x = 0;
        int y = 0;
        int sum;
        Student[] students = new Student[]{student, aspirant};
        for (int i = 0; i < students.length; i++) {
            x = student.getGrantAmount();
            y = aspirant.getGrantAmount();
        }
        sum = x + y;
        System.out.println("Grants amount for all students: " + sum);
    }
}
