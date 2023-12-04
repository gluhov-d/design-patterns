package com.github.gluhov.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FlightCrew {
    List<Pilot> pilots = new ArrayList<>();

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public void removePilot(Pilot pilot) {
        pilots.remove(pilot);
    }

    public void performFlight() {
        System.out.println("Performing a flight.\n");
        for (Pilot pilot : pilots) {
            pilot.aircraftControl();
        }
    }
}
