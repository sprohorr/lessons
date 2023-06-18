package homework3;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                if(i>=10) {
                    System.out.print("<" + i + ">" + " ");
                }
            }
        }
    }
}
