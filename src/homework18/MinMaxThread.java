package homework18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            list.add(scanner.nextInt());
        }
        Integer min = Integer.valueOf(String.valueOf(list.stream().min(Integer::compare).get()));
        Integer max = Integer.valueOf(String.valueOf(list.stream().max(Integer::compare).get()));
        Thread thread = new Thread(String.valueOf(new MaxMinRunnable(String.valueOf(min))));
        Thread thread2 = new Thread(String.valueOf(new MaxMinRunnable(String.valueOf(max))));

        thread.start();
        thread2.start();

        System.out.println(thread.isAlive());
        System.out.println(thread2.isAlive());
    }
}
