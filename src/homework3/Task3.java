package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        String size = scanner.nextLine();

        switch (size) {
            case "XS" -> System.out.println("Очень маленький;");
            case "S" -> System.out.println("Маленький;");
            case "M" -> System.out.println("Средний;");
            case "L" -> System.out.println("Большой;");
            case "XL" -> System.out.println("Очень большой;");
            case "XXL" -> System.out.println("Очень-очень большой;");
            case "XXXL" -> System.out.println("Очень-очень большой;");
            case "XXXXL" -> System.out.println("Очень-очень большой;");
            case "XXXXXL" -> System.out.println("Очень-очень большой;");
            default -> System.out.println("Не верный ввод!");
        }
    }


}

