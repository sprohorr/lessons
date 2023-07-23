package homework12.checkPassword.exception;


public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException(boolean b) {
    }

    public String toString() {
        return String.valueOf(false);
    }
}
