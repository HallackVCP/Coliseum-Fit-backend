package br.com.core.coliseumfitapplication.services.exceptions;

public class InvalidUsernameException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidUsernameException(String msg) {
        super(msg);
    }

    public InvalidUsernameException(String msg, Throwable cause) {
        super(msg, cause);
    }



}
