package com.tranzaxis.schemas.digitized_card.exceptions;


public class DatabaseException extends Exception{

    public DatabaseException() {
        super();
    }

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(Exception exception) {
        super(exception);
    }
}
