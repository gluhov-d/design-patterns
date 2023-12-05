package com.github.gluhov.behavioral.command;

public class NavigationCommand implements AircraftCommand{
    FlightOperationsSystem flightOperationsSystem;

    public NavigationCommand(FlightOperationsSystem flightOperationsSystem) {
        this.flightOperationsSystem = flightOperationsSystem;
    }

    @Override
    public void execute() {
        flightOperationsSystem.navigate();
    }
}