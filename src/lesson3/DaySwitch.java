package lesson3;

public class DaySwitch {
    public static void main(String[] args) {
        String dayTime = "morning";

        switch (dayTime){
            case "morning":
                System.out.println("6 - 12 o'clock");
                break;
            case "day":
                System.out.println("12 - 18 o'clock");
                break;
            case "evening":
                System.out.println("18 - 0 o'clock");
                break;
            case "night":
                System.out.println("0 - 6 o'clock");
                break;
            default:
                System.out.println("uknown day6 time");

        }
    }
}
