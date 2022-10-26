package com.kodilla.abstracts.homework;

public abstract class Shape {

    double r;
    public Shape ( double r) {
        this.r = r;


    }


    public abstract double countArea();


    public abstract void countPerimeter();
}



//public class CalcApplication { wywolanie obliczenia obwodu kola to metoda
//   public static void main(String[] args) {
//      Calculator calculator = new Calculator();
//      double area = calculator.circleArea(10);          // [1]
//      System.out.println("Area of the Circle with radius 10 equals: " + area);
//   }
//}