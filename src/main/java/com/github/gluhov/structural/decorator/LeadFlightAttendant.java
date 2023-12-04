package com.github.gluhov.structural.decorator;

public class LeadFlightAttendant extends FlightCrewMemberDecorator{

    public LeadFlightAttendant(FlightCrewMember flightCrewMember) {
        super(flightCrewMember);
    }

    public String ensurePassengersSafety() {
        return "Check evacuation exits. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + ensurePassengersSafety();
    }
}
