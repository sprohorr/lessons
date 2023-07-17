package homework10.stringMethod;

public class StringMethod {

    static char findLastChar(String str) {
        return str.charAt(str.length() - 1);
    }

    static String toString(String str) {
        return str;
    }

    static boolean compareEnd(String str) {
        return str.endsWith("!!!");
    }

    static boolean compareStart(String str) {
        return str.startsWith("I like");
    }

    static boolean compareWord(String str) {
        return str.contains("Java");
    }

    static int findPositionWord(String str) {
        return str.indexOf("Java");
    }

    static String replaceСharacter(String str) {
        return str.replace('a', 'o');
    }

    static String stringUp(String str) {
        return str.toUpperCase();
    }

    static String stringLow(String str) {
        return str.toLowerCase();
    }

    static String cutString(String str) {
        return str.substring(7, 11);
    }


}