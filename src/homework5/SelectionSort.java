package homework5;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
