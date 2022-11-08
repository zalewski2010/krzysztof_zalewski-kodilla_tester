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
        double acceleration = getIncreaseSpeed();

        if (drawnCarKind ==0) {
            return new Citroen(acceleration); }

        if (drawnCarKind==1 ) {
            return new Peugeot(acceleration); }

       else if (drawnCarKind  ==2  ) {
            return new Renault(acceleration); }

        else { return null;
        }



    }

    public static double getIncreaseSpeed() {
        return random.nextInt(51);
    }
    }



