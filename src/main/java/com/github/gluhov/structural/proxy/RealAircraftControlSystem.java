package com.github.gluhov.structural.proxy;

public class RealAircraftControlSystem implements AircraftControlSystem{
    @Override
    public void executeCommand(String command) {
        System.out.println("Executing command " + command + " on real aircraft control system.");
    }
}