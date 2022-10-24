package com.kodilla.inheritance.homework;
import java.time.Year;
public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020, 2022);
        operatingSystem.setTurnOn();
        operatingSystem.displayNumberOfTurnOff();
    }
}
