package com.aston.java.lesson_02.HomeTask_02;

import static com.aston.java.lesson_02.HomeTask_02.Animal.AnimalProperties.*;

public class Fish extends Mammal implements AbilityToLiveInWater{


    @Override
    public void describeTypeOfAnimal() {
        super.describeTypeOfAnimal();
        System.out.println(Animal);
        System.out.println(Fish);
    }

    @Override
    public void canLiveInWater() {
        System.out.println(Water);

    }

    @Override
    public void tellAllAboutAnAnimal() {
        describeTypeOfAnimal();
        canLiveInWater();
        System.out.println();
    }
}
