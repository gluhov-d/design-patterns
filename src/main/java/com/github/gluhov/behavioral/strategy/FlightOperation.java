package com.github.gluhov.behavioral.strategy;

public class FlightOperation {
    public static void main(String[] args) {
        FlightContext flight = new FlightContext();

        flight.setStrategy(new TakeoffStrategy());
        flight.executeStrategy();

        flight.setStrategy(new CruiseStrategy());
        flight.executeStrategy();

        flight.setStrategy(new LandingStrategy());
        flight.executeStrategy();
    }
}