package com.tranzaxis.schemas.digitized_card.exceptions;


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
