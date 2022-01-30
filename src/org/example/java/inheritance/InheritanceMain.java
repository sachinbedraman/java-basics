package org.example.java.inheritance;

import org.example.java.inheritance.abstractclass.Child;

public class InheritanceMain {
    public static void main(String[] args) {

        // Usual way of creating a object
        Parent p = new Parent();
        p.parentMethod();

        // Child calling parent methods
        Child c = new Child();
        c.parentMethod();
        c.childMethod();

        Parent p1 = new Child();
        p1.parentMethod();
    }
}
