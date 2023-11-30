package com.github.gluhov.creational.factory;

public class AirplaneFactory implements AircraftFactory{
    @Override
    public Aircraft createAircraft() {
        return new Airplane();
    }
}
