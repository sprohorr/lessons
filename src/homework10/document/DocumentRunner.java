package homework10.document;

import static homework10.document.model.DocumentNumber.*;

public class DocumentRunner {
    public static void main(String[] args) {
        String number = "1234abc5678def9j0k";
        System.out.println(number);

        System.out.println(cutString(number));
        System.out.println(charReplacement(number));
        System.out.println("Letters: " + charLow(number));
        System.out.println("Letters: " + charUp(number));
        System.out.println("Содержит \"abc\"?");
        System.out.println("Содержит: " + compareLetters(number));
        System.out.println("Начинается с \"555\"?");
        System.out.println("Начинается с: " + compareStartDocNumber(number));
        System.out.println("Заканчивается на \"1a2b\"?");
        System.out.println("Заканчивается на: " + compareEndDocNumber(number));
    }
}

