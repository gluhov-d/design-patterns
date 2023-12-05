package com.github.gluhov.behavioral.state;

public class InFlightState implements AircraftState {
    @Override
    public void handleState(AircraftContext context) {
        System.out.println("The aircraft is in flight");
        context.setState(new LandingState());
    }
}