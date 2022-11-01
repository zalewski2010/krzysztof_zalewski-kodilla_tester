package com.kodilla.collections.interfaces.homework;

import static java.lang.Double.sum;

public class Renault implements Car{
    private int decreaseSpeed;
    private int increaseSpeed;


    public Renault(int decreaseSpeed, int increaseSpeed) {  // konstruktor
        this.decreaseSpeed = decreaseSpeed;
        this.increaseSpeed = increaseSpeed;

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
