package homework11.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {
    public static String findAbbreviation(String str) {
        Pattern pattern = Pattern.compile("([А-Я]{2,6})+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        return str;
    }
}
