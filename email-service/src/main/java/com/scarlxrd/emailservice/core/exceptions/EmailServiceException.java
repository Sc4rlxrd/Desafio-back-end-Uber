package com.scarlxrd.emailservice.core.exceptions;

public class EmailServiceException extends RuntimeException{
    public EmailServiceException(String message){
        super(message);
    }
    public EmailServiceException(String massage, Throwable cause){
        super(massage,cause);
    }
}
