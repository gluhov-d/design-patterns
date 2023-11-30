package com.github.gluhov.creational.factory;

public class HelicopterFactory implements AircraftFactory{
    @Override
    public Aircraft createAircraft() {
        return new Helicopter();
    }
}
