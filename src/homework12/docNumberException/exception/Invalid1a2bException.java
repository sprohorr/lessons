package homework12.docNumberException.exception;

public class Invalid1a2bException extends InvalidAbcException {
    public Invalid1a2bException(String bool) {
        super(bool + EXCEPTION_MESSAGE);
    }

    public static Invalid1a2bException createInvalid1a2bException() {
        return new Invalid1a2bException(EXCEPTION_MESSAGE);
    }
}
