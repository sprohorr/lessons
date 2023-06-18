package homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            int i = 0;
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            if (number > 0) {
                while (i <= number) {
                    i++;
                }
                System.out.println("Сумма всех положительных чисел до " + number + " равна " + (i * (number) / 2));

                System.out.println("Если хотите закончить, то введите \" 0 \" ");
            } else if (number == 0) {
                break;
            }
        }


    }


}
