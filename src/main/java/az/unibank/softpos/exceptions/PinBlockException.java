package az.unibank.softpos.exceptions;


public class PinBlockException extends Exception {

    public PinBlockException() {
        super();
    }

    public PinBlockException(String message) {
        super(message);
    }

    public PinBlockException(Exception exception) {
        super(exception);
    }
}
