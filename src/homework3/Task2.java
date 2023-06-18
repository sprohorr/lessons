package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время: ");
        byte time = scanner.nextByte();

        if (time >= 10 && time <= 19) {
            System.out.println("\"Добро пожаловать!\"");
        } else if (time < 0) {
            System.out.println("\"Ошибка ввода!\"");
        } else if (time > 19 && time <= 24) {
            System.out.println("\"Закрыто!\"");
        } else if (time == 0 && time < 10) {
            System.out.println("\"Закрыто!\"");
        } else {
            System.out.println("\"Ошибка ввода!\"");
        }
    }
}
