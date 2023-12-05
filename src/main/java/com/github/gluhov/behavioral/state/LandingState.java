package com.github.gluhov.behavioral.state;

public class LandingState implements AircraftState {
    @Override
    public void handleState(AircraftContext context) {
        System.out.println("The aircraft is landing");
        context.setState(new TaxiingState());
    }
}