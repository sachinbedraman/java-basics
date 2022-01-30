package org.example.java.basics;

public class AccessModifiers {
    // 4 types
    // Private

    // Exclusively within the class
    private String privateString;

    // private + Accessible only to the child classes
    protected String protectedString;

    // Default or package = available only within the package
    String defaultAccessString;

    // Public access
    public String publicString;

    void setPrivateString(){
        this.privateString = "Hello";
    }
}
