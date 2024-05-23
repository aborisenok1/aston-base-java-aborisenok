package com.aston.java.lesson_02.HomeTask_02;

import static com.aston.java.lesson_02.HomeTask_02.Animal.AnimalProperties.*;

public class Whale extends Mammal implements AbilityToLiveInWater{
    @Override
    public void canLiveInWater() {
        System.out.println(Water);

    }

    @Override
    public void tellAllAboutAnAnimal() {
        super.tellAllAboutAnAnimal();
        System.out.println(Whale);
        System.out.println(Mammal);
        canLiveInWater();
        System.out.println();
    }
}
