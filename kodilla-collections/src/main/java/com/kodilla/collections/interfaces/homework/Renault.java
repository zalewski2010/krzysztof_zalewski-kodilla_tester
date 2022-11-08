package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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
    public String toString() {
        return "Renault{" +
                "decreaseSpeed=" + decreaseSpeed +
                ", increaseSpeed=" + increaseSpeed +
                '}';
    }

    @Override
    public int increaseSpeed() {

        return increaseSpeed;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Renault renault)) return false;
        return decreaseSpeed == renault.decreaseSpeed && increaseSpeed == renault.increaseSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(decreaseSpeed, increaseSpeed);
    }
}
