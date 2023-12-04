package com.github.gluhov.structural.bridge;

public class ScheduledMaintenance {

    public static void main(String[] args) {
        Maintenance[] maintenances = {
                new PassengerAirline(new AvionicEngineer()),
                new CargoHelicopter(new ElectricalEngineer())
        };

        for (Maintenance maintenance : maintenances) {
            maintenance.createMaintenanceProgram();
        }
    }
}
