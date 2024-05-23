package com.aston.java.lesson_03;

import java.util.Objects;

public class Bear {
    private String petName;
    private int petAge;

    public Bear(String petName, int age) {
        this.petName = petName;
        this.petAge = age;
    }

    public String getBearName() {
        return petName;
    }

    public int getBearAge() {
        return petAge;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Bear bear = (Bear) object;
        return bear.petName.equals(this.petName)
                && bear.petAge == this.petAge;
    }

    public int hashCode(Bear bear4) {
        return Objects.hash(petName, petAge);
    }
}
