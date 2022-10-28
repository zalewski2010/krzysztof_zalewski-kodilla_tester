package com.kodilla.abstracts.homework;

import org.w3c.dom.ls.LSOutput;

public class PersonApp {

    public static void main(String[] args) {
        Job soldier = new Soldier();
        Person person1 = new Person("John", 45, soldier);
        System.out.println("Person1 is a " + person1.getJob().getJobName() + " have to do: " + person1.getJob().getResponsibilities());
        System.out.println("Person1 earn" + person1.getJob().getSalary());
        System.out.println("\r");

        Job driver = new Driver();
        Person person2 = new Person("Mike", 49, driver);
        System.out.println("Person2 is a " + person2.getJob().getJobName() + " have to do: " + person2.getJob().getResponsibilities());
        System.out.println("Person2 earn" + person2.getJob().getSalary());
        System.out.println("\r");

        Job politics = new Politics();
        Person person3 = new Person("Joe", 55, politics);
        System.out.println("Person3 is a " + person3.getJob().getJobName() + " have to do: " + person3.getJob().getResponsibilities());
        System.out.println("Person3 earn" + person3.getJob().getSalary());
        System.out.println("\r");

        Job sportsmen = new Politics();
        Person person4 = new Person("David", 32, sportsmen);
        System.out.println("Person4 is a " + person4.getJob().getJobName() + " have to do: " + person4.getJob().getResponsibilities());
        System.out.println("Person4 earn" + person4.getJob().getSalary());
        System.out.println("\r");
    }
}
