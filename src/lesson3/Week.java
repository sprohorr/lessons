package lesson3;
import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String weekDay = scan.nextLine();
        switch (weekDay){
            case "monday" -> System.out.println("week day");
            case "tuesday" -> System.out.println("week day");
            case "wednesday" -> System.out.println("week day");
            case "thursday" -> System.out.println("week day");
            case "friday" -> System.out.println("week day");
            case "saturday" -> System.out.println("weekend");
            case "sanyday" -> System.out.println("weekend");
            default -> System.out.println("uknown");
        }
    }
}
