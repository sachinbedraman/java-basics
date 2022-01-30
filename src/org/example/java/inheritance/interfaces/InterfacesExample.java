package org.example.java.inheritance.interfaces;

public interface InterfacesExample {
    // By default public and abstract
    void interfaceMethod();

    // Default interface methods
    default  void anotherInterfaceMethod(){
        System.out.println("Default method");
    }
}
