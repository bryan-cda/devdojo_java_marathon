package br.com.example.exception;

public class InvalidSexyTypeException extends Exception{
    public InvalidSexyTypeException(String message, String sexy){
        super(message + sexy);
    }
}
