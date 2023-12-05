package com.github.gluhov.behavioral.strategy;

public class TakeoffStrategy implements FlightStrategy{
    @Override
    public void execute(FlightContext context) {
        System.out.println("Executing takeoff strategy");
    }
}