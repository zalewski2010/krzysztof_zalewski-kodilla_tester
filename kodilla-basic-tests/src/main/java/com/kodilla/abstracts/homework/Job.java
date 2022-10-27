package com.kodilla.abstracts.homework;

public abstract class Job {
    private final int salary;
    private final String responsibilities;
    private final String jobName;

    public Job(String jobName, String responsibilities, int salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }
    public int getSalary() {
    return salary; }

    public String getResponibilities() {
        return responsibilities;
    }

    public abstract void salary();
    public abstract void responsibilities();

}





//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
// Utwórz kilka konkretnych zawodów (klas dziedziczących po Job).
// W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
// Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.