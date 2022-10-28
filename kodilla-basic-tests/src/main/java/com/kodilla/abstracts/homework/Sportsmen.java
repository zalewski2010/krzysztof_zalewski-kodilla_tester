package com.kodilla.abstracts.homework;

public class Sportsmen extends Job{
    public Sportsmen() {
        super("sportsmen", "1.Training. 2.Playing.",4000);
    }
    public void salary() {
        System.out.println("sportsmen salary: " + getSalary());
    }
    public void responsibilities() {
        System.out.println("sportsmen responsibilities " + getResponibilities());
    }
}
