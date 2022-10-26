package com.kodilla.abstracts;

public class Dog extends Animal {
    public Dog() { // konstruktor klasy Dog
        super(4); // przyjęcie liczby nóg w argumencie
    }

    @Override
    public void giveVoice() {  //szablon metody, której ciało możemy dodać wedle własnego uznania:
        System.out.println("Hau Hau");

    }
}
