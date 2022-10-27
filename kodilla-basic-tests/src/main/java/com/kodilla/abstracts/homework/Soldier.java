package com.kodilla.abstracts.homework;


import java.sql.SQLOutput;

public class Soldier extends Job {
    public Soldier() {
        super("Soldier", "1.Defence 2. Attack ", 1500);
    }

    public void salary() {
        System.out.println("policeman salary: " + getSalary());
    }
    public void responsibilities() {
        System.out.println("Soldier responsibilities " + getResponibilities());
    }
}
