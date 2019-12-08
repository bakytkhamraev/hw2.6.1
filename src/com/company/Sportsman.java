package com.company;

public class Sportsman<E extends Number, T extends Number> implements Drawable {

    E age;
    T weight;

    public Sportsman(E age, T weight) {
        this.age = age;
        this.weight  = weight;
    }

    @Override
    public Number number1() {
        return null;
    }

    @Override
    public Number number2() {
        return null;
    }
}