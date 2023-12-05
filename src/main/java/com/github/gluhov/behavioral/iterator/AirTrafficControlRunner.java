package com.github.gluhov.behavioral.iterator;

public class AirTrafficControlRunner {
    public static void main(String[] args) {
        FlightCollection flightCollection = new FlightCollection();

        flightCollection.addFlight(new Flight("FL123", "Moscow"));
        flightCollection.addFlight(new Flight("FL456", "Saint-Petersburg"));

        FlightIterator iterator = flightCollection.iterator();
        while (iterator.hasNext()) {
            Flight flight = iterator.next();
            System.out.println("Flight Number: " + flight.getFlightNumber() + ", Destination: " + flight.getDestination());
        }
    }
}