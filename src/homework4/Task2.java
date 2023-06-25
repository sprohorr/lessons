package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("enter size array: ");
        int[] mass = new int[scan.nextInt()];

        if (mass.length == 0) {
            System.out.println("End!");
            return;
        }

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }

        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));

        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            count += mass[i];
        }
        int size = mass.length;
        double sum = (double) count / size;

        int min = mass[0];
        int max = mass[mass.length - 1];

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + sum);
    }
}


