package homework6;

import java.util.Scanner;

public class CreditCardRunner {
    public static void main(String[] args) {

        CreditCard visa = new CreditCard("Visa", 1001, 50);
        CreditCard master = new CreditCard("Master", 1002, 68);
        CreditCard belcard = new CreditCard("Belcard", 1003, 300);

        System.out.println(visa);
        System.out.println(master);
        System.out.println(belcard);

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number card : ");
            int numbCard = scanner.nextInt();
            switch (numbCard) {
                case 1001 -> {
                    System.out.println("Enter 1 - balance.");
                    System.out.println("Enter 2 - top up.");
                    System.out.println("Enter 3 - withdraw.");
                    System.out.println("Operation number: ");
                    int operationNumber = scanner.nextInt();
                    switch (operationNumber) {
                        case 1 -> {
                            System.out.println(visa);
                        }
                        case 2 -> {
                            System.out.println("Enter top up sum: ");
                            double sum = scanner.nextDouble();
                            visa.topUp(sum);
                            System.out.println(visa);
                        }
                        case 3 -> {
                            System.out.println("Enter withdraw sum: ");
                            double sum = scanner.nextDouble();
                            visa.withdraw(sum);
                            System.out.println(visa);
                        }
                    }
                }
                case 1002 -> {
                    System.out.println("Enter 1 - balance.");
                    System.out.println("Enter 2 - top up.");
                    System.out.println("Enter 3 - withdraw.");
                    System.out.println("Operation number: ");
                    int operationNumber = scanner.nextInt();
                    switch (operationNumber) {
                        case 1 -> {
                            System.out.println(master);
                        }
                        case 2 -> {
                            System.out.println("Enter top up sum: ");
                            double sum = scanner.nextDouble();
                            master.topUp(sum);
                            System.out.println(master);
                        }
                        case 3 -> {
                            System.out.println("Enter withdraw sum: ");
                            double sum = scanner.nextDouble();
                            master.withdraw(sum);
                            System.out.println(master);
                        }
                    }
                }
                case 1003 -> {
                    System.out.println("Enter 1 - balance.");
                    System.out.println("Enter 2 - top up.");
                    System.out.println("Enter 3 - withdraw.");
                    System.out.println("Operation number: ");
                    int operationNumber = scanner.nextInt();
                    switch (operationNumber) {
                        case 1 -> {
                            System.out.println(belcard);
                        }
                        case 2 -> {
                            System.out.println("Enter top up sum: ");
                            double sum = scanner.nextDouble();
                            belcard.topUp(sum);
                            System.out.println(belcard);
                        }
                        case 3 -> {
                            System.out.println("Enter withdraw sum: ");
                            double sum = scanner.nextDouble();
                            belcard.withdraw(sum);
                            System.out.println(belcard);
                        }
                    }
                }
            }
            if (numbCard == 0) {
                break;
            } else {
                System.out.println("[Enter \"0\" to exit!]");
            }
        }

    }
}
