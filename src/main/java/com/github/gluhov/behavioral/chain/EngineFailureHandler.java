package com.github.gluhov.behavioral.chain;

public class EngineFailureHandler extends AircraftEmergencyHandler{
    @Override
    public void handleEmergency(EmergencyType type) {
        if (type == EmergencyType.ENGINE_FAILURE) {
            System.out.println("Handling engine failure");
        } else if (nextHandler != null) {
            nextHandler.handleEmergency(type);
        }
    }
}