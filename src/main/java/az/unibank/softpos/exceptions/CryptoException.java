package az.unibank.softpos.exceptions;


public class CryptoException extends Exception{

    public CryptoException() {
        super();
    }

    public CryptoException(String message) {
        super(message);
    }

    public CryptoException(Exception exception) {
        super(exception);
    }
}
