package com.kodilla.abstracts;

public class AnimalProcessor { // klasa AnimalProcessor

    public void process(Animal animal) { // metoda process, przyjmująca w argumencie abstrakcyjny typ Animal
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs"); // wywołanie animal.getNumbersOflegs() - z kazdego konkretnego obiektu(który jest podtypem Animal) chcemy wywołać metodę getNumberOfLegs()
        animal.giveVoice();
    }


    }


