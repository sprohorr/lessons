package homework15.age;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Age100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date [dd. MM. yyyy]: ");
        scanner.findInLine("(\\d{2})\\s(\\d{2})\\s(\\d{4})");
        try {
            MatchResult mr = scanner.match();
            int month = Integer.parseInt(mr.group(2));
            int day = Integer.parseInt(mr.group(1));
            int year = Integer.parseInt(mr.group(3));
            LocalDate date = LocalDate.of(year, month, day);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            System.out.println(dateFormatter.format(date.plusYears(100)));
        } catch (IllegalStateException e) {
            System.err.println("Invalid input!");
        }

    }

}
