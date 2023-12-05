package com.github.gluhov.behavioral.state;

public class AircraftContextRunner {
    public static void main(String[] args) {
        AircraftContext aircraft = new AircraftContext();

        aircraft.applyState();
        aircraft.applyState();
        aircraft.applyState();
        aircraft.applyState();
    }
}