package az.unibank.softpos.exceptionsV2;


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
