package com.github.gluhov.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class AirportManagerApp {

    public static void main(String[] args) {
        AirportFactory airportFactory = new AirportFactory();
        List<Airport> airports = new ArrayList<>();

        airports.add(airportFactory.getAirportByCode("LED"));
        airports.add(airportFactory.getAirportByCode("LED"));
        airports.add(airportFactory.getAirportByCode("LED"));
        airports.add(airportFactory.getAirportByCode("LED"));
        airports.add(airportFactory.getAirportByCode("LED"));
        airports.add(airportFactory.getAirportByCode("VGD"));
        airports.add(airportFactory.getAirportByCode("VGD"));
        airports.add(airportFactory.getAirportByCode("VGD"));
        airports.add(airportFactory.getAirportByCode("VGD"));
        airports.add(airportFactory.getAirportByCode("VGD"));

        for (Airport airport : airports) {
            airport.getInfo();
        }
    }
}
