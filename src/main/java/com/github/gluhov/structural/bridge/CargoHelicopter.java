package com.github.gluhov.structural.bridge;

public class CargoHelicopter extends Maintenance{

    protected CargoHelicopter(Engineer engineer) {
        super(engineer);
    }

    @Override
    public void createMaintenanceProgram() {
        System.out.println("Creating maintenance program for cargo helicopter.");
        engineer.maintain();
    }
}
