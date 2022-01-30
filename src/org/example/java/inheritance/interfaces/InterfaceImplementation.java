package org.example.java.inheritance.interfaces;

public  class InterfaceImplementation implements InterfacesExample, AnotherInterface{
    @Override
    public void interfaceMethod() {
        System.out.println("Method implemented");
    }

    @Override
    public void anotherInterfaceMethod() {
        System.out.println("Default overriden");
    }

    @Override
    public void method() {

    }
}
