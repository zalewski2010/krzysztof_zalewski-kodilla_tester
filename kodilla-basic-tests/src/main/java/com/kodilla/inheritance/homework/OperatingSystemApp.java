package com.kodilla.inheritance.homework;
import java.time.Year;
public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2012, 2022);
        operatingSystem.setTurnOn();
        operatingSystem.displayNumberOfTurnOff();
    }
}
