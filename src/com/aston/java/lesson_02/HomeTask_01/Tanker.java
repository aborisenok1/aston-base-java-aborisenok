package com.aston.java.lesson_02.HomeTask_01;

import static com.aston.java.lesson_02.HomeTask_01.Vehicle.Vehicles.*;


public class Tanker extends Vehicle implements Propeller, Carryble {
    @Override
    public void tellAllAboutVehicle() {
        describeTypeOfVehicle();
        propeller();
        carryble();
        System.out.println();
    }

    @Override
    public void describeTypeOfVehicle() {
        System.out.println(Tanker);
    }

    @Override
    public void propeller() {
        System.out.println(Propeller);
    }

    @Override
    public void carryble() {
        System.out.println(Carryble);
    }
}
