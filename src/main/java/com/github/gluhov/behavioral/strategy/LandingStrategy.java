package com.github.gluhov.behavioral.strategy;

public class LandingStrategy implements FlightStrategy{
    @Override
    public void execute(FlightContext context) {
        System.out.println("Executing landing strategy");
    }
}