package com.kodilla.collections.interfaces;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {  // konstruktor
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius*radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI*radius;
    }

}
