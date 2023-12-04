package com.github.gluhov.structural.decorator;

public class FlightCrewMemberDecorator implements FlightCrewMember{

    FlightCrewMember flightCrewMember;

    public FlightCrewMemberDecorator(FlightCrewMember flightCrewMember) {
        this.flightCrewMember = flightCrewMember;
    }

    @Override
    public String makeJob() {
        return flightCrewMember.makeJob();
    }
}
