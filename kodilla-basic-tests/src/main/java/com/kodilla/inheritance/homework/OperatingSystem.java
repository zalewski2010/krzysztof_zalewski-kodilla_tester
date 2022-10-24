package com.kodilla.inheritance.homework;

import java.time.Year;

public class OperatingSystem {

    private int turnOn;
    private int turnOff;

    public OperatingSystem(int turnOn, int turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }


    public void setTurnOn() {
        System.out.println("Your windows is from: " + turnOn + " and we don't have new updates");
    }

    public void displayNumberOfTurnOff() {
        System.out.println("Your linux is from: " + turnOff + " and you should be happy");
    }
}



////W nowym pakiecie com.kodilla.inheritance.homework utwórz klasę OperatingSystem.
////Utwórz metody turnOn(), turnOff() oraz konstruktor przyjmujący rok wydania danego systemu operacyjnego.
////Następnie dodaj dwie klasy dziedziczące po OperatingSystem nadpisujące metody z klasy wyżej. Utwórz osobną klasę z metodą main,
//// w której zaprezentujesz działanie Twojego kodu.