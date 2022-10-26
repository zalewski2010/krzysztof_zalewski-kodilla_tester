package com.kodilla.abstracts.homework;

public class Tire205 extends Shape{


    public Tire205() {
        super(30.5);
    }


    @Override
    public double countArea() {
        System.out.println("Obwód opony Tire205 = " + 2*Math.PI*r + " cm" );
        return 2*Math.PI*r;
    }
    public void countPerimeter() {
        System.out.println("Powierzchnia opony Tire205 = " + Math.PI * r * r + " cm2"); }
}

