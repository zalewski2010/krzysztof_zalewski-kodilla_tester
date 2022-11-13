package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

        public static List<Flight> getFlightsTable () {
            List<Flight> flights = new ArrayList<>();
            flights.add(new Flight("Warszawa", "Berlin"));
            flights.add(new Flight("Warszawa", "Madryt"));
            flights.add(new Flight("Berlin", "Geneva"));
            flights.add(new Flight("Berlin", "Zurich"));
            flights.add(new Flight("Madryt", "Lizbona"));
            flights.add(new Flight("Madryt", "Porto"));


            return flights;


        }


    }

