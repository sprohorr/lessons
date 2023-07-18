package homework10.document.model;


public class DocumentNumber {

    static public String cutString(String number) {
        return number.substring(0, 4) + " " + number.substring(7, 11);
    }

    static public String charReplacement(String number) {
        return number.substring(0, 4) + number.substring(4, 7).replace("abc", "***") + number.substring(7, 11) + number.substring(11, 14).replace("def", "***") + number.substring(14, 18);
    }

    static public String charLow(String number) {
        return number.substring(4, 7).toLowerCase() + number.substring(11, 14).toLowerCase() + number.toLowerCase().charAt(15) + number.toLowerCase().charAt(17);
    }

    static public StringBuilder charUp(String number) {
        return new StringBuilder(number.substring(4, 7).toUpperCase() + number.substring(11, 14).toUpperCase() + number.toUpperCase().charAt(15) + number.toUpperCase().charAt(17));
    }

    static public String compareLetters(String number) {
        if (number.substring(4, 7).equalsIgnoreCase("abc")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        return number.substring(4, 7);
    }

    static public String compareStartDocNumber(String number) {
        if (number.startsWith("555")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        return number.substring(0, 3);
    }

    static public String compareEndDocNumber(String number) {
        if (number.endsWith("1a2b")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        return number.substring(14, 18);
    }

}