package com.github.gluhov.behavioral.command;

public class FlightOperationsSystemRunner {
    public static void main(String[] args) {
        FlightOperationsSystem flightOperationsSystem = new FlightOperationsSystem();

        AircraftPilot aircraftPilot = new AircraftPilot(
                new CommunicationCommand(flightOperationsSystem),
                new NavigationCommand(flightOperationsSystem));

        aircraftPilot.communicate();
        aircraftPilot.navigate();
    }
}