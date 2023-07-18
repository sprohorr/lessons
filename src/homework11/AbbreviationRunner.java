package homework11;

import java.util.Scanner;

import static homework11.model.Abbreviation.findAbbreviation;

public class AbbreviationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();

        System.out.println(findAbbreviation(str));
    }
}
