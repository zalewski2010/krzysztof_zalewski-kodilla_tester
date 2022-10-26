package com.kodilla.abstracts;


import com.kodilla.abstracts.homework.Tire185;
import com.kodilla.abstracts.homework.Tire195;
import com.kodilla.abstracts.homework.Tire205;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog(); // obiekt Dog stworzony z klasy Animal // zamiast tego może być Dog dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor(); // metoda polimorficzna(wielopostaciowa), do obiektu wyższego przypisujemy obiekt typu niższego
        processor.process(dog);

        Duck duck = new Duck();
        duck.giveVoice(); // metoda giveVoice

        Tire185 tire185 = new Tire185();
        tire185.countArea();

        tire185.countPerimeter();

        Tire195 tire195 = new Tire195();
        tire195.countArea();
        tire185.countPerimeter();

        Tire205 tire205 = new Tire205();
        tire205.countArea();
        tire205.countPerimeter();
    }




}
