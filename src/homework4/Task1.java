package homework4;


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] fruits = {"peach", "banana", "orange", "apple"};

        System.out.println(fruits[1] + " " + fruits[3]);
        fruits[2] = "lemon";
        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
    }
}


