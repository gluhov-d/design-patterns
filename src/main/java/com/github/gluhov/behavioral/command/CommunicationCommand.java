package com.github.gluhov.behavioral.command;

public class CommunicationCommand implements AircraftCommand{
    FlightOperationsSystem flightOperationsSystem;

    public CommunicationCommand(FlightOperationsSystem flightOperationsSystem) {
        this.flightOperationsSystem = flightOperationsSystem;
    }

    @Override
    public void execute() {
        flightOperationsSystem.communicate();
    }
}