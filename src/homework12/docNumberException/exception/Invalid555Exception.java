package homework12.docNumberException.exception;

public class Invalid555Exception extends InvalidAbcException {
    public Invalid555Exception(String b) {
        super(b + EXCEPTION_MESSAGE);

    }

    public static Invalid555Exception createInvalid555Exception() {
        return new Invalid555Exception(EXCEPTION_MESSAGE);
    }
}
