package homework2;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        double maxPrice = 1400;
        double discount = maxPrice - (maxPrice * 0.07);

        System.out.println("Enter price:  ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();


        double discountPrice = price >= maxPrice ? discount : price;
        System.out.println("Price: " + discountPrice);

    }
}
