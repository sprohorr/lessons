package homework10.stringMethod;

import java.util.Scanner;


public class TextRunner {
    public static void main(String[] args) {
        StringMethod str = new StringMethod();

        Scanner scanner = new Scanner(System.in);
        String text = String.valueOf(scanner.nextLine());
        System.out.println(str.toString(text));

        System.out.println("Last character: " + str.findLastChar(text));
        System.out.println("End of text: " + str.compareEnd(text));
        System.out.println("Text start: " + str.compareStart(text));
        System.out.println("Is there a word \"Java\"?: " + str.compareWord(text));
        System.out.println("Position of the word \"Java\": " + str.findPositionWord(text));
        System.out.println("Replace characters 'a' with 'o':" + str.replaceСharacter(text));
        System.out.println("To uppercase: " + str.stringUp(text));
        System.out.println("To lowercase: " + str.stringLow(text));
        System.out.println("Cut the string \"Java\": " + str.cutString(text));

    }
}
