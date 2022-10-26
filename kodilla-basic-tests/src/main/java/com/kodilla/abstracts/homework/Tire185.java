package com.kodilla.abstracts.homework;

public class Tire185 extends Shape {



    public Tire185() {
        super(25);
    }


    @Override
    public double countArea() {



        System.out.println("Obwód opony Tire185 = "  + 2*Math.PI*r + " cm.");
        return 2*Math.PI*r;
    }
    public void countPerimeter() {
        System.out.println("Powierzchnia opony Tire185 = "+ Math.PI*r*r + " cm2");

    }

}
