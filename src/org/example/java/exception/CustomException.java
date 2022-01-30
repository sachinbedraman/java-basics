package org.example.java.exception;

public class CustomException extends Exception{

    public CustomException(String msg){
        super(msg);
    }

    public CustomException(String msg, Exception e){
        super(msg, e);
    }
}
