package com.github.gluhov.structural.decorator;

public class FlightAttendant implements FlightCrewMember{

    @Override
    public String makeJob() {
        return "Show how to use rescue equipment. ";
    }
}
