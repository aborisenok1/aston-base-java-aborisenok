package com.aston.java.lesson_02.HomeTask_02;

public abstract class Animal {

    public abstract void describeTypeOfAnimal();

    public abstract void furExists();

    public abstract void spineExists();

    public abstract void tellAllAboutAnAnimal();

    public enum AnimalProperties {
        Animal("I am an Animal"),
        Mammal("I am a Mammal"),

        Cat("I am a Cat"),
        Bear("I am a Bear"),
        Whale("I am a Whale"),
        Fish("I am a Fish"),


        Spine("I have Spine"),
        Fur("I have Fur"),

        Water("I live in water");

        private final String fldVal;

        AnimalProperties(String value) {
            this.fldVal = value;
        }

        @Override
        public String toString() {
            return String.valueOf(fldVal);
        }
    }

}
