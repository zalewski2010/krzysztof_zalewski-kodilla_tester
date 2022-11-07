package com.kodilla.collections.interfaces.homework;

public class Renault implements Car{
    private int decreaseSpeed;
    private int increaseSpeed;


    public Renault(int decreaseSpeed, int increaseSpeed) {  // konstruktor
        this.decreaseSpeed = decreaseSpeed;
        this.increaseSpeed = increaseSpeed;

    }

    public Renault(double a) {
    }


    @Override
    public int getSpeed() {
        return increaseSpeed-decreaseSpeed; }


    @Override
    public int decreaseSpeed() {
        return decreaseSpeed;
    }


    @Override
    public int increaseSpeed() {

        return increaseSpeed;
    }
}
