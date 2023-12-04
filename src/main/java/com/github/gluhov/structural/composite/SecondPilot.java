package com.github.gluhov.structural.composite;

public class SecondPilot implements Pilot{
    @Override
    public void aircraftControl() {
        System.out.println("Control aircraft parameters and check flight route.");
    }
}
