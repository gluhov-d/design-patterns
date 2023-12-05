package com.github.gluhov.behavioral.chain;

public class AircraftEmergencySystemRunner {
    public static void main(String[] args) {
        AircraftEmergencyHandler engineFailureHandler = new EngineFailureHandler();
        AircraftEmergencyHandler cabinPressureHandler = new CabinPressureHandler();

        engineFailureHandler.setNextHandler(cabinPressureHandler);

        engineFailureHandler.handleEmergency(EmergencyType.ENGINE_FAILURE);
        engineFailureHandler.handleEmergency(EmergencyType.CABIN_PRESSURE_LOSS);
    }
}
