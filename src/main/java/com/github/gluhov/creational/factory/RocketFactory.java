package com.github.gluhov.creational.factory;

public class RocketFactory implements AircraftFactory{
    @Override
    public Aircraft createAircraft() {
        return new Rocket();
    }
}
