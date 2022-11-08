package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Peugeot{" +
                "decreaseSpeed=" + decreaseSpeed +
                ", increaseSpeed=" + increaseSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Peugeot peugeot)) return false;
        return decreaseSpeed == peugeot.decreaseSpeed && increaseSpeed == peugeot.increaseSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(decreaseSpeed, increaseSpeed);
    }
}
