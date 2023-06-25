package homework5;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] array = new char[128];

        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }

        System.out.println("input : ");
        int num = scan.nextInt();

        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if (n == num) {
                System.out.println(num + " number is: " + " '" + array[i] + "' " + " character");
            }

        }
    }
}
