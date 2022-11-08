package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Renault;

import static com.kodilla.collections.arrays.homework.CarsApplication.getIncreaseSpeed;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car increase: " + getIncreaseSpeed());


    }


    public static String getCarName(Car car) {
        if (car instanceof Citroen)
            return "Citroen";
        else if (car instanceof Peugeot)
            return "Peugeot";
        else if (car instanceof Renault)
            return "Renault";
        else
            return "Unknown car name";
    }
    }




