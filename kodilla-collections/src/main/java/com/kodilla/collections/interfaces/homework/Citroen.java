package com.kodilla.collections.interfaces.homework;

public class Citroen implements Car {

    private int decreaseSpeed;
    private int increaseSpeed;


    public Citroen(int decreaseSpeed, int increaseSpeed) { // konstruktor
        this.decreaseSpeed = decreaseSpeed;
        this.increaseSpeed = increaseSpeed;

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
