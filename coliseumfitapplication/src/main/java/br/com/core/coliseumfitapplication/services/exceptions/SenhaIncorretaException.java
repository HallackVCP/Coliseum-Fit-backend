package br.com.core.coliseumfitapplication.services.exceptions;

public class SenhaIncorretaException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public SenhaIncorretaException(String msg) {
        super(msg);
    }

    public SenhaIncorretaException(String msg, Throwable cause) {
        super(msg, cause);
    }



}
