package homework16.taskOptional;

import java.util.Optional;

public class FourSymbolOrJava {
    public static void main(String[] args) {
        printFourSymbol("");
    }

    public static void printFourSymbol(String s) {
        String name = (String) Optional.empty().orElse(s);
        System.out.println(name);
        if (name.length() > 4) {
            System.out.println(name.substring(0, 4));
        } else {
            System.out.println("JAVA");
        }
    }
}
