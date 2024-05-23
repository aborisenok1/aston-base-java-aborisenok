package com.aston.java.lesson_02.HomeTask_02;

import static com.aston.java.lesson_02.HomeTask_02.Animal.AnimalProperties.*;

public class Bear extends Mammal{

    @Override
    public void describeTypeOfAnimal() {
        super.describeTypeOfAnimal();
        System.out.println(Bear);
        System.out.println(Mammal);
    }

    @Override
    public void furExists() {
        super.furExists();
        System.out.println(Fur);
    }

    @Override
    public void tellAllAboutAnAnimal() {
        super.tellAllAboutAnAnimal();
        describeTypeOfAnimal();
        furExists();
        System.out.println();
    }
}
