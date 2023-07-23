package homework12.checkPassword.exception;


public class WrongPasswordException extends WrongLoginException {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(boolean b) {
        super(b);
    }
}
