package v1.az.unibank.softpos.exceptions;


public class TransAxisException extends Exception {

    public TransAxisException() {
        super();
    }

    public TransAxisException(String message) {
        super(message);
    }

    public TransAxisException(Exception exception) {
        super(exception);
    }
}
