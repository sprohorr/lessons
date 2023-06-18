package homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = scanner.nextInt();

        if (temp > -5) {
            System.out.println("<<" + "warm" + ">>");
        } else if (temp <= -20) {
            System.out.println("<<" + "cold" + ">>");
        } else if (-5 >= temp && temp >= -20) {
            System.out.println("<<" + "normal" + ">>");
        }

    }
}
