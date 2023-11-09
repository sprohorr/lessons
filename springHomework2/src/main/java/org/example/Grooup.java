package org.example;

public class Grooup {
    private int numberGroup;

    public Grooup() {
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                " number group=" + numberGroup +
                '}';
    }
}
