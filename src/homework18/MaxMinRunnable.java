package homework18;

public class MaxMinRunnable implements Runnable {

    public MaxMinRunnable(String s) {
    }

    @Override
    public void run() {
        System.out.printf("%s started ... \n", Thread.currentThread());
    }


}
