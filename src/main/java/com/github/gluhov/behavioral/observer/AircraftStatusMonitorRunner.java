package com.github.gluhov.behavioral.observer;

public class AircraftStatusMonitorRunner {
    public static void main(String[] args) {
        AircraftStatusMonitor statusMonitor = new AircraftStatusMonitor();

        statusMonitor.setParameter("FuelLevel", "75%");
        statusMonitor.addObserver(new FuelSystemMonitor());

        statusMonitor.setParameter("FuelLevel", "25%");
    }
}
