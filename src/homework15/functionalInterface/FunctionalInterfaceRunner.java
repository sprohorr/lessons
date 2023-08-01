package homework15.functionalInterface;

import java.util.function.*;

public class FunctionalInterfaceRunner {
    public static void main(String[] args) {
        String str = "Java!";

        Predicate<String> isExclamationQuestion = s -> (s == "!") && (s != "?");
        System.out.println(isExclamationQuestion.test(str));

        Function<String, String> getLastChar = s -> String.valueOf(s.charAt(s.length() - 1));
        System.out.println(getLastChar.apply(str));

        Consumer<String> printlastChar = s -> System.out.println(s.charAt(s.length() - 1));
        printlastChar.accept(str);

        UnaryOperator<String> getStr = s -> s.substring(1, 4);
        System.out.println(getStr.apply(str));

        Supplier<String> supplier = () -> {
            String userInput = "JAVA is the BEST";
            return userInput;
        };
        System.out.println(supplier.get());
    }
}
