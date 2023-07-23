package homework12.docNumberException.model;

import homework12.docNumberException.exception.Invalid1a2bException;
import homework12.docNumberException.exception.Invalid555Exception;
import homework12.docNumberException.exception.InvalidAbcException;

public class DocNumber {
    static public String cutString(String docNumber) {
        return docNumber.substring(0, 4) + " " + docNumber.substring(9, 13);
    }

    static public String replaceChar(String docNumber) {
        return docNumber.substring(0, 4) + "***" + docNumber.substring(9, 13) + "***" + docNumber.substring(18, 22);
    }

    static public String lowChar(String number) {
        number = number.toLowerCase();
        return number.substring(5, 8) + "/" + number.substring(14, 17) + "/" + number.charAt(19) + "/" + number.charAt(21);
    }

    static public String upChar(String docNumber) {
        docNumber = docNumber.toUpperCase();
        return docNumber.substring(5, 8) + "/" + docNumber.substring(14, 17) + "/" + docNumber.charAt(19) + "/" + docNumber.charAt(21);
    }

    static public boolean compareLetters(String docNumber) throws InvalidAbcException {
        boolean abc = docNumber.toLowerCase().contains("abc");
        if (!abc) {
            throw InvalidAbcException.createAbcException();
        }
        return abc;
    }

    static public boolean compareStartDocNumber(String docNumber) throws Invalid555Exception {
        boolean b = docNumber.startsWith("555");
        if (!b) {
            throw Invalid555Exception.createInvalid555Exception();
        }
        return b;
    }

    static public boolean compareEndDocNumber(String docNumber) throws Invalid1a2bException {
        boolean bool = docNumber.endsWith("1a2b");
        if (!bool) {
            throw Invalid1a2bException.createInvalid1a2bException();
        }
        return bool;
    }
}
