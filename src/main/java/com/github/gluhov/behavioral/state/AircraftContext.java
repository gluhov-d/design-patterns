package com.github.gluhov.behavioral.state;

public class AircraftContext {
    private AircraftState state;

    public AircraftContext() {
        this.state = new TaxiingState();
    }

    public void setState(AircraftState state) {
        this.state = state;
    }

    public void applyState() {
        state.handleState(this);
    }
}