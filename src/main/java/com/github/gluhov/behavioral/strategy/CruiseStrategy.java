package com.github.gluhov.behavioral.strategy;

public class CruiseStrategy implements FlightStrategy{
    @Override
    public void execute(FlightContext context) {
        System.out.println("Executing cruise strategy");
    }
}