package org.example.java.inheritance.abstractclass;

import java.util.Arrays;
import java.util.List;

public class AbstractionExample {
    public static void main(String[] args) {
        Brake b = new DrumBrake();
        b.brake();

        b = new HydraulicBrake();
        b.brake();


        // Polymorphism
        Brake drumBrake = new DrumBrake();
        Brake hydraulicBrake = new HydraulicBrake();


        Brake brake = null;
        String type = "D"; // H - Hydraulic, D - Drum brake
        if(type == "H")
            brake = hydraulicBrake;

        if(type == "D")
            brake = drumBrake;

        brake.brake();
    }
}
