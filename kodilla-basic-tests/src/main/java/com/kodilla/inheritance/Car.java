package com.kodilla.inheritance;

public class Car {
    private int wheels; //prywatna zmienna
    private int seats; // prywatna zmienna

    public Car(int wheels, int seats) {  //konstruktor Car
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLights() {  // metoda turnOnLights
        System.out.println("Lights were turned on");
    }

    public void openDoors() {  // metoda openDoors
        System.out.println("Opening 4 doors"); }

    public void displayNumberOfSeats() {  // metoda displayNumberOfSeats
            System.out.println("number of seats: " + seats);
        }


    public int getWheels() { // getter getWheels
        return wheels;
    }

    public int getSeats() { //  getter getSeats
        return seats;
    }
}


//Patrząc od góry, mamy w nim deklarację dwóch prywatnych zmiennych, dalej konstruktor Car,
// później dwie metody (turnOnLights i openDoors), a na końcu dwa gettery: getWheels i getSeats.