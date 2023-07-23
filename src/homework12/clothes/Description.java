package homework12.clothes;

public enum Description {
    XXS("32"),
    XS("34"),
    S("36"),
    M("38"),
    L("40");


    Description(String euroSize) {
    }

    Description(Description description, String euroString) {
    }

    public void getDescription(String euroSize) {
        if (euroSize.equals("32")) {
            System.out.println(" Детский размер");
        } else {
            System.out.println("Взрослый размер");
        }
    }
}