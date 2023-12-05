package com.github.gluhov.behavioral.chain;

public class CabinPressureHandler extends AircraftEmergencyHandler{
    @Override
    public void handleEmergency(EmergencyType type) {
        if (type == EmergencyType.CABIN_PRESSURE_LOSS) {
            System.out.println("Handling cabin pressure loss");
        } else if (nextHandler != null) {
            nextHandler.handleEmergency(type);
        }
    }
}
