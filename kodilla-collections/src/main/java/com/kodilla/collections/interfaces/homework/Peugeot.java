package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car{
    private int decreaseSpeed;
    private int increaseSpeed;


    public Peugeot(int decreaseSpeed, int increaseSpeed) {  // konstruktor
        this.decreaseSpeed = decreaseSpeed;
        this.increaseSpeed = increaseSpeed;

    }

    public Peugeot(double a) {
    }

    @Override
    public int getSpeed() {
        return increaseSpeed-decreaseSpeed;
    }

    @Override
    public int decreaseSpeed() {

        return decreaseSpeed;
    }

    @Override
    public int increaseSpeed() {

        return increaseSpeed;
    }
}
