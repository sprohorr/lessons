package homework14.animal.model;

import java.util.LinkedList;

public class Animals {
    public static LinkedList<String> animal = new LinkedList<>();

    public static void addLastAnimal(String s) {
        animal.addLast(s);
    }

    public static void removeFirstAnimal() {
        animal.removeFirst();
    }

    public static void printList(LinkedList<String> animal) {
        for (String el : animal) {
            System.out.print(el + ",");
        }
        System.out.println();
    }
}
