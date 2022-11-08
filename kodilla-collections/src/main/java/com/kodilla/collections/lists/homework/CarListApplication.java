package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.getCarName;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Renault(4,50));
        cars.add(new Renault(6,55));
        cars.add(new Peugeot(5,60));
        cars.add(new Peugeot(6,65));
        cars.add(new Citroen(7,70));
        cars.add(new Citroen(5,75));

        cars.remove(1);

        Citroen citroen = new Citroen (5,75);
        cars.remove(citroen);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(car + ", car: " + getCarName(car) + ", speed: " + car.getSpeed());
        }
    }
}
