package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarsApplication {

    private static final Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {

        int drawnCarKind = random.nextInt(3);
        double a = getIncreaseSpeed();

        if (drawnCarKind ==0) {
            return new Citroen(a); }

        if (drawnCarKind==1 ) {
            return new Peugeot(a); }

       else if (drawnCarKind  ==2  ) {
            return new Renault(a); }

        else { return null;
        }



    }

    public static double getIncreaseSpeed() {
        return random.nextInt(51);
    }
    }



//private static Shape drawShape() {
//        int drawnShapeKind = RANDOM.nextInt(3);
//        double a = getRandomSize();
//        if (drawnShapeKind == 0)
//            return new Circle(a);
//        else if (drawnShapeKind == 1)
//            return new Square(a);
//        else {
//            double b = getRandomSize();
//            double c = getRandomSize();
//            return new Triangle(a, b, c);
//        }
//    }
//
//    private static double getRandomSize() {
//        return RANDOM.nextDouble() * 100 + 1;

//car.increaseSpeed()