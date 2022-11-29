package com.tranzaxis.schemas.digitized_card.exceptions;


public class ParserException extends Exception{

    public ParserException() {
        super();
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(Exception exception) {
        super(exception);
    }
}
