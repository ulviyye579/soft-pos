package az.unibank.softpos.exceptions;


public class RtpException extends Exception{

    public RtpException() {
        super();
    }

    public RtpException(String message) {
        super(message);
    }

    public RtpException(Exception exception) {
        super(exception);
    }
}
