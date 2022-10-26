package com.kodilla.abstracts.homework;

public class Tire195 extends Shape{

    public Tire195() {
        super(27.5);

    }



    @Override
    public double countArea() {
        System.out.println("Obwód opony Tire195 = " + 2*Math.PI*r + " cm");
        return 2*Math.PI*r;
    }

        public void countPerimeter() {
        System.out.println("Powierzchnia opony Tire195 = "+ Math.PI * r * r + " cm2");

    }
}
