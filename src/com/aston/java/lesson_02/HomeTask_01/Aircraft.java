package com.aston.java.lesson_02.HomeTask_01;


import static com.aston.java.lesson_02.HomeTask_01.Vehicle.Vehicles.*;

public class Aircraft extends Vehicle implements Wheels, Propeller, Wings, Carryble {

    @Override
    public void tellAllAboutVehicle() {
        describeTypeOfVehicle();
        wheels();
        propeller();
        wings();
        carryble();
        System.out.println();
    }

    @Override
    public void describeTypeOfVehicle() {
        System.out.println(Aircraft);
    }

    @Override
    public void wheels() {
        System.out.println(Wheels);
    }

    @Override
    public void propeller() {
        System.out.println(Propeller);
    }

    @Override
    public void wings() {
        System.out.println(Wings);
    }

    @Override
    public void carryble() {
        System.out.println(Carryble);
    }
}
