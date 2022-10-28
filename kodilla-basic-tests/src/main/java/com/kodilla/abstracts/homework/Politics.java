package com.kodilla.abstracts.homework;

public class Politics extends Job{
    public Politics() {
        super("politic" , "1.Talking bla bla. 2. Creating taxes.",3000);
    }
    public void salary() {
        System.out.println("politics salary: " + getSalary());
    }
    public void responsibilities() {
        System.out.println("politics responsibilities " + getResponsibilities());
    }
}

