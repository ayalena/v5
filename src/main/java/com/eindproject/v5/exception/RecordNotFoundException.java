package com.eindproject.v5.exception;

public class RecordNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException(){
        super("Record not found");
    }
}
