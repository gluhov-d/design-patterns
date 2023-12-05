package com.github.gluhov.behavioral.chain;

public abstract class AircraftEmergencyHandler {
    protected AircraftEmergencyHandler nextHandler;

    public void setNextHandler(AircraftEmergencyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleEmergency(EmergencyType type);
}
