package org.example.java.inheritance.abstractclass;

public abstract class Brake {

    public abstract void applyBrake();

    public  void  brake(){
        System.out.println("Applying brakes now");
        this.applyBrake();
    }

}
