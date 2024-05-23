package com.aston.java.lesson_02.HomeTask_02;

import static com.aston.java.lesson_02.HomeTask_02.Animal.AnimalProperties.*;

public class Cat extends Animal {
    @Override
    public void describeTypeOfAnimal() {
        System.out.println(Cat);
    }

    @Override
    public void furExists() {
        System.out.println(Fur);

    }

    @Override
    public void spineExists() {

    }

    @Override
    public void tellAllAboutAnAnimal() {
        describeTypeOfAnimal();
        furExists();
        System.out.println();
    }
}
