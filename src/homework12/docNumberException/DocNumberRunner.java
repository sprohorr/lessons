package homework12.docNumberException;

import homework12.docNumberException.exception.Invalid1a2bException;
import homework12.docNumberException.exception.Invalid555Exception;
import homework12.docNumberException.exception.InvalidAbcException;

import static homework12.docNumberException.model.DocNumber.*;


public class DocNumberRunner {
    public static void main(String[] args) throws InvalidAbcException {
        String docNumber = "1234-abc-5678-def-9j0k";
        System.out.println(docNumber);

        System.out.println(cutString(docNumber));
        System.out.println(replaceChar(docNumber));
        System.out.println("Letters: " + lowChar(docNumber));
        System.out.println("Letters: " + upChar(docNumber));
        try {
            System.out.println("Содержит \"abc\"?");
            System.out.println(compareLetters(docNumber));
            System.out.println("Начинается с \"555\"?");
            System.out.println(compareStartDocNumber(docNumber));
            System.out.println("Заканчивается на \"1a2b\"?");
            System.out.println(compareEndDocNumber(docNumber));
        } catch (Invalid555Exception e2) {
            System.out.println("Invalid");
        } catch (Invalid1a2bException e3) {
            System.out.println("Invalid");
        } catch (InvalidAbcException e) {
            System.out.println("Invalid");
        }
    }

}
