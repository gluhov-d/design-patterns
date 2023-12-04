package com.github.gluhov.structural.bridge;

public class PassengerAirline extends Maintenance{

    public PassengerAirline(Engineer engineer) {
        super(engineer);
    }

    @Override
    public void createMaintenanceProgram() {
        System.out.println("Creating maintenance program for airline.");
        engineer.maintain();
    }
}
