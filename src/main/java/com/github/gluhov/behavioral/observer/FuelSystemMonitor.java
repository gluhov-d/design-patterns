package com.github.gluhov.behavioral.observer;

public class FuelSystemMonitor implements AircraftObserver {
    @Override
    public void update(String parameter, String value) {
        if (parameter.equals("FuelLevel")) {
            System.out.println("Fuel System Update: " + value);
        }
    }
}
