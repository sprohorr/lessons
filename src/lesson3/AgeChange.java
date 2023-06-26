package lesson3;
import java.util.Scanner;
public class AgeChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        while (age > 0) {
            if (age >= 18) {
                System.out.println("Доступ разрешён");
            } else {
                System.out.println("Доступ запрещён");
                age = scan.nextInt();
            }
        }
    }
}
