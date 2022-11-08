package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Citroen implements Car {

    private int decreaseSpeed;
    private int increaseSpeed;


    public Citroen(int decreaseSpeed, int increaseSpeed) { // konstruktor
        this.decreaseSpeed = decreaseSpeed;
        this.increaseSpeed = increaseSpeed;

    }

    public Citroen(double a) {
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

    @Override
    public String toString() {
        return "Citroen{" +
                "decreaseSpeed=" + decreaseSpeed +
                ", increaseSpeed=" + increaseSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citroen citroen)) return false;
        return decreaseSpeed == citroen.decreaseSpeed && increaseSpeed == citroen.increaseSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(decreaseSpeed, increaseSpeed);
    }
}
