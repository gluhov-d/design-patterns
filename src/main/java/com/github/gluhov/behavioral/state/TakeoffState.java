package com.github.gluhov.behavioral.state;

public class TakeoffState implements AircraftState {
    @Override
    public void handleState(AircraftContext context) {
        System.out.println("The aircraft is taking off");
        context.setState(new InFlightState());
    }
}