package homework7.phone;

import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    double weight;
    private String name;

    public String receiveCall() {
        return "Call {" + this.name + "} " + getNumber();

    }

    public int getNumber() {
        return number;
    }

    public Phone(String model, int number, double weight) {
        this(model, number);
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {

    }

    public void receiveCall(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void sendMessage(int number, int... number2) {
        this.number = number;
        System.out.println(number + " Send a message to this number " + Arrays.toString(number2));
    }

}
