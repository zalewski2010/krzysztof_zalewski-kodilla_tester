package com.kodilla.collections.interfaces.homework;



public class CarRace {
    public static void main(String[] args) {
        Renault renault = new Renault(40+40,90+60+70);
        System.out.println("Renault Megane WRC:");
        doRace(renault);


        Peugeot peugeot = new Peugeot(40+40,86+57+67);
        System.out.println("Peugeot 306 WRC");
        doRace(peugeot);


       Citroen citroen = new Citroen(40+40,82+54+64);
       System.out.println("Citroen C4 WRC");
       doRace(citroen);

    }
    private static void doRace(Car car) {

        System.out.println(car.increaseSpeed() +("  suma przyspieszeń"));
        System.out.println(car.decreaseSpeed()+(" suma zwolnień"));
        System.out.println(car.getSpeed() +(" aktualna prędkość po przyśpieszaniu i zwalnianiu"));

    }
    }

