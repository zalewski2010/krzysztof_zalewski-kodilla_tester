package com.kodilla.optional.homework;

public class Teacher {
    private String name;



    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public Teacher(String name) {
        this.name = name;



    }
}
