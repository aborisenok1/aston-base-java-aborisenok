package com.aston.java.lesson_02.HomeTask_01;

import static com.aston.java.lesson_02.HomeTask_01.Vehicle.Vehicles.*;

public class Taxi extends Vehicle implements Wheels {
    @Override
    public void tellAllAboutVehicle() {
        describeTypeOfVehicle();
        wheels();
        System.out.println();
    }

    @Override
    public void describeTypeOfVehicle() {
        System.out.println(Taxi);
    }

    @Override
    public void wheels() {
        System.out.println(Wheels);
    }
}
