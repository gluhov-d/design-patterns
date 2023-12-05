package com.github.gluhov.structural.proxy;

public class ProxyAircraftControlSystem implements AircraftControlSystem{
    RealAircraftControlSystem realAircraftControlSystem;

    public ProxyAircraftControlSystem(RealAircraftControlSystem realAircraftControlSystem) {
        this.realAircraftControlSystem = realAircraftControlSystem;
    }

    @Override
    public void executeCommand(String command) {
        if (isValidCommand(command)) {
            realAircraftControlSystem.executeCommand(command);
        } else {
            System.out.println("Invalid command " + command);
        }
    }

    private boolean isValidCommand(String command) {
        return command != null && !command.isEmpty();
    }
}