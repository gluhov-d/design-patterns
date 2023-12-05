package com.github.gluhov.structural.composite;

public class FlightRunner {
    public static void main(String[] args) {
        FlightCrew flightCrew = new FlightCrew();
        Pilot firstPilot = new FirstPilot();
        Pilot secondPilot = new SecondPilot();

        flightCrew.addPilot(firstPilot);
        flightCrew.addPilot(secondPilot);

        flightCrew.performFlight();
    }
}
