package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }

    public void openDoors() {
        System.out.println("Opening 4 doors"); }

    public void displayNumberOfSeats() {
            System.out.println("number of seats: " + seats);
        }


    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }
}


//Patrząc od góry, mamy w nim deklarację dwóch prywatnych zmiennych, dalej konstruktor Car,
// później dwie metody (turnOnLights i openDoors), a na końcu dwa gettery: getWheels i getSeats.