package com.github.gluhov.behavioral.state;

public class TaxiingState implements AircraftState {
    @Override
    public void handleState(AircraftContext context) {
        System.out.println("The aircraft is taxiing");
        context.setState(new TakeoffState());
    }
}