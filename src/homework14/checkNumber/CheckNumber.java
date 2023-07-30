package homework14.checkNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        String[] number = new String[]{String.valueOf(scanner.nextLine())};
        Set set = new HashSet();
        set.add(Arrays.toString(number));
        printCollection(set);
    }

    private static void printCollection(Set set) {
        for (Object el : set) {
            System.out.print(el);
        }
        System.out.println();
    }

}
