package org.example.java.exception;

public class CustomExpMain {
    public static void main(String[] args) {
        Example e = new Example();
        try {
            System.out.println("Sum = " + e.addNumbers(0, -3));
        } catch (CustomException ex){
            System.out.println("Exception  " + ex.getMessage() + "  " + ex.getCause());
            ex.printStackTrace();
        }
    }
}
