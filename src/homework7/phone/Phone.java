package homework7.phone;

import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private double weight;


    public int getNumber() {
        return number;
    }

    public Phone(String model, int number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public String receiveCall(String name) {
        return "Call {" + name + "} " + getNumber();
    }

    public String receiveCall(String name, int number) {
        return "Call {" + name + " from number: " + number + "} ";
    }

    public void sendMessage(int... number) {
        System.out.println("Send a message to this number: " + Arrays.toString(number));
    }

}
