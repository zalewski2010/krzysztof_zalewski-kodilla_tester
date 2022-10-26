package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs; // modyfikator (private) dostępu czy zmienna prywatna int?

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs; //metoda czy zmienna?? a może konstruktor Animal???
    }
    public int getNumberOfLegs() { //getter
        return numberOfLegs;
    }
    public abstract void giveVoice(); // metoda abstrakcyjna giveVoice(), nie stawiamy klamer w takich metodach
}
