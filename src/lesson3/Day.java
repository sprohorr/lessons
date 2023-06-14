package lesson3;

public class Day {
    public static void main(String[] args) {
        int hours = 5;
        if (hours >= 6 && hours < 12){
            System.out.println( "morning");
    } else if (hours >= 12 && hours < 18) {
            System.out.println("day");
        } else if (hours >= 18 && hours < 22) {
            System.out.println("evening");
        } else if ((hours >= 22 && hours <= 24)||(hours>=0 && hours < 6)) {
            System.out.println("night");
        }
    }
}
