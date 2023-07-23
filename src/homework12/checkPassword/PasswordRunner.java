package homework12.checkPassword;

import homework12.checkPassword.exception.WrongLoginException;
import homework12.checkPassword.exception.WrongPasswordException;
import homework12.checkPassword.model.Password;

import static homework12.checkPassword.model.Password.*;

public class PasswordRunner {
    public static void main(String[] args) throws WrongLoginException {
        Password pw = new Password("abcd", "1234g", "12 34g");

        try {
            checkLogin(pw);
            checkPassword(pw);
            checkConfirmPassword(pw);

        } catch (WrongPasswordException e) {
            System.out.println("password" + " " + e.toString());
        } catch (WrongLoginException e2) {
            System.out.println("login" + " " + e2.toString());
        }

    }
}
