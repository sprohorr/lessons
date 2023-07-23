package homework12.checkPassword.model;

import homework12.checkPassword.exception.WrongLoginException;
import homework12.checkPassword.exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private static String login;
    private static String password;
    private static String confirmPassword;

    public Password(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void checkLogin(Password pw) throws WrongLoginException {
        Pattern patternLogin = Pattern.compile("^\\S{1,20}$");
        Matcher matcherLogin = patternLogin.matcher(login);
        boolean b = matcherLogin.matches();
        if (!b) {
            throw new WrongLoginException(false);
        } else
            System.out.println(true);
    }

    public static void checkPassword(Password pw) throws WrongPasswordException {
        Pattern patternPassword = Pattern.compile("^\\w+\\S{1,20}$");
        Matcher matcherPassword = patternPassword.matcher(password);
        boolean b = matcherPassword.matches();
        if (!b) {
            throw new WrongPasswordException(false);
        } else {
            System.out.println(true);
        }
    }

    public static void checkConfirmPassword(Password pw) throws WrongPasswordException {
        if (confirmPassword.equals(password)) {
            System.out.println(true);
        } else throw new WrongPasswordException(false);
    }
}
