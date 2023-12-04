package com.github.gluhov.structural.decorator;

public class Task {
    public static void main(String[] args) {
        FlightCrewMember flightAttendant = new FlightAttendant();
        System.out.println(flightAttendant.makeJob());

        FlightCrewMember leadFlightAttendant = new LeadFlightAttendant(new FlightAttendant());
        System.out.println(leadFlightAttendant.makeJob());
    }
}
