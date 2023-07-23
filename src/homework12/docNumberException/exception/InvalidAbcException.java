package homework12.docNumberException.exception;

public class InvalidAbcException extends Exception {
    protected static final String EXCEPTION_MESSAGE = "Invalid";


    public static InvalidAbcException createAbcException() {
        return new InvalidAbcException(EXCEPTION_MESSAGE);
    }

    public InvalidAbcException(String s) {
    }
}
