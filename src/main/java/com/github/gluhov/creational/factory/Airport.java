package com.github.gluhov.creational.factory;

public class Airport {
    public static void main(String[] args) {
        AircraftFactory aircraftFactory = createAircraftByType("rocket");
        Aircraft aircraft = aircraftFactory.createAircraft();

        aircraft.fly();
    }

    private static AircraftFactory createAircraftByType(String type) {
        if (type.equalsIgnoreCase("airplane")) {
            return new AirplaneFactory();
        } else if (type.equalsIgnoreCase("helicopter")) {
            return new HelicopterFactory();
        } else if (type.equalsIgnoreCase("rocket")) {
            return new RocketFactory();
        } else {
            throw new RuntimeException(type + " not supported.");
        }
    }
}
