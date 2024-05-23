package com.aston.java.lesson_02.HomeTask_01;

import static com.aston.java.lesson_02.HomeTask_01.Vehicle.Vehicles.*;

public class Truck extends Vehicle implements Wheels, Carryble {

    @Override
    public void tellAllAboutVehicle() {
        describeTypeOfVehicle();
        wheels();
        carryble();
        System.out.println();
    }

    @Override
    public void describeTypeOfVehicle() {
        System.out.println(Truck);
    }

    @Override
    public void wheels() {
        System.out.println(Wheels);
    }

    @Override
    public void carryble() {
        System.out.println(Carryble);
    }
}
