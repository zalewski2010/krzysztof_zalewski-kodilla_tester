package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void findFlightsFrom() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Warszawa");
        //then
        List<Flight> flightsFrom = new ArrayList<>();
        flightsFrom.add(new Flight("Warszawa", "Berlin"));
        flightsFrom.add(new Flight("Warszawa", "Madryt"));
        assertEquals(flightsFrom, result);
        System.out.println(result);
    }
    @Test
    public void findFlightsFrom1() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Berlin");
        //then
        List<Flight> flightsFrom = new ArrayList<>();
        flightsFrom.add(new Flight("Berlin", "Geneva"));
        flightsFrom.add(new Flight("Berlin", "Zurich"));
        assertEquals(flightsFrom, result);
        System.out.println(result);
    }

    @Test
    public void findFlightsTo() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Berlin");
        //then
        List<Flight> flightsTo = new ArrayList<>();
        flightsTo.add(new Flight("Warszawa", "Berlin"));
        assertEquals(flightsTo,result);
        System.out.println(result);
    }
    @Test
    public void findFlightsTo1() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Madryt");
        //then
        List<Flight> flightsTo = new ArrayList<>();
        flightsTo.add(new Flight("Warszawa", "Madryt"));
        assertEquals(flightsTo,result);
        System.out.println(result);
    }
}