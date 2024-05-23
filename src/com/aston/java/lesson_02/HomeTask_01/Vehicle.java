package com.aston.java.lesson_02.HomeTask_01;

public abstract class Vehicle {
    public abstract void describeTypeOfVehicle();

    public abstract void tellAllAboutVehicle();

    public enum Vehicles {
        Aircraft("I am an Aircraft"),
        Boat("I am Boat"),
        Helicopter("I am Helicopter"),
        Tanker("I am Tanker"),
        Truck("I am Truck"),
        Taxi("I am Taxi"),


        Wheels("I have Wheels"),
        Propeller("I have Propeller"),
        Wings("I have Wings"),
        Carryble("I can carry different cargoes");

        private final String fldVal;

        Vehicles(String value) {
            this.fldVal = value;
        }

        public String toString() {
            return String.valueOf(fldVal);
        }
    }
}
