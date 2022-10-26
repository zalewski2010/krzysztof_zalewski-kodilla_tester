package com.kodilla.abstracts.homework;

public abstract class Job {
    double salary;
    String responsibilities;

    public Job(String responsibilities, double salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

}





//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
// Utwórz kilka konkretnych zawodów (klas dziedziczących po Job).
// W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
// Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.