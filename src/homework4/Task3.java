package homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write down text: ");
        String text = scanner.nextLine();
        System.out.println();

        char[] conversely = text.toCharArray();
        for (int i = conversely.length - 1; i >= 0; i--) {
            System.out.print(conversely[i]);
        }
    }
}
