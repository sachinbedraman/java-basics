package org.example.java.advanced;

import org.example.java.basics.AccessModifiers;

public class ExampleClass {

    void foo(){
        AccessModifiers a = new AccessModifiers();
    }

    public static void main(String[] args) {
        AccessModifiers a = new AccessModifiers();
        a.publicString = "adad";
    }

}
