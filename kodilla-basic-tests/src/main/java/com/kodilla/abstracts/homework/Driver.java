package com.kodilla.abstracts.homework;

public class Driver extends Job{
    public Driver(){
        super("driver" ,"1.Driving, 2.Selling ice cream", 2000);

    }
    public void salary() {
       System.out.println("driver salary: " + getSalary());
   }
  public void responsibilities() {
       System.out.println("driver responsibilities " + getResponsibilities());
   }
}
