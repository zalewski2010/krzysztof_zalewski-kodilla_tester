package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Duck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Person {
    String job;
    String firstName;
    String age;


    public void inicjuj()
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imię");
        firstName = br.readLine();
        System.out.println("Podaj wiek");
        age = br.readLine();
        System.out.println("Podaj zawód");
        job = br.readLine();

    }

    public void drukuj() {
        System.out.println("Przetwarzam dane i drukuję kartę mobilizacji :");
        System.out.println("FirstName: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job); {

        }

    }

}

class Main {
       public static void main(String[] args)

           throws IOException
           {
               Person job = new Person();
               job.inicjuj();
               job.drukuj();
           }
       }




// private static int length;
//    String name;
//    int age;
//    int size;
//
//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//        int sum = 0;
//        this.size = 0;
//    }
//
//    public static void main(String[] args) {
//        User anna = new User("Anna", 20);
//        User betty = new User("Betty", 33);
//        User carl = new User("Carl", 58);
//        User david = new User("David", 13);
//        User eva = new User("Eva", 18);
//        User frankie = new User("Frankie", 45);
//        User[] users = {anna, betty, carl, david, eva, frankie};