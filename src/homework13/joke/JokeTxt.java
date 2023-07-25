package homework13.joke;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JokeTxt {
    private static String joke = "У меня из IT-ков в семье,только \"закодированный\" батя";

    public static void main(String[] args) {

        File dirJoke = new File("C:\\Users\\User\\IdeaProjects\\lessons\\src\\homework13", "joke.txt");
        try {
            System.out.println(dirJoke.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter(dirJoke)) {
            writer.write(joke);
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
        String[] strArray = joke.split(" ");
        System.out.println("Самое длинное слово: " + strArray[findLongestWord(strArray)]);

        File dirJoke2 = new File("C:\\Users\\User\\IdeaProjects\\lessons\\src\\homework13", "longest-word.txt");
        try {
            System.out.println(dirJoke2.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter(dirJoke2)) {
            writer.write(strArray[findLongestWord(strArray)]);
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
    }

    public static int findLongestWord(String[] strArray) {
        int maxLong = strArray[0].length();
        int index = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLong) {
                maxLong = strArray[i].length();
                index = i;
            }
        }
        return index;
    }
}
