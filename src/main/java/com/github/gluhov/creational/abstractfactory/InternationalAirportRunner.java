package com.github.gluhov.creational.abstractfactory;

import com.github.gluhov.creational.abstractfactory.airport.CivilAirportTeamFactory;

public class InternationalAirportRunner {
    public static void main(String[] args) {
        AirportTeamFactory civilAirportTeamFactory = new CivilAirportTeamFactory();
        Pilot pilot = civilAirportTeamFactory.getPilot();
        Dispatcher dispatcher = civilAirportTeamFactory.getDispatcher();
        Aeromechanic aeromechanic = civilAirportTeamFactory.getAeromechanic();

        System.out.println("Open new airport.");
        dispatcher.coordinate();
        pilot.fly();
        aeromechanic.repair();
    }
}
