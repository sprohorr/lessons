package lesson3;

public class Counter {
    public static void main(String[] args) {
        for(int i = 100; i>=1; i-=10){
            System.out.print(i);
            if (i == 10) {
                return;// break;// continue;
            }
            System.out.println("end");
        }
    }
}
