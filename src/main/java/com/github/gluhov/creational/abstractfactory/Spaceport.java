package com.github.gluhov.creational.abstractfactory;

import com.github.gluhov.creational.abstractfactory.spaceport.SpaceportTeamFactory;

public class Spaceport {
    public static void main(String[] args) {
        AirportTeamFactory spaceportTeamFactory = new SpaceportTeamFactory();
        Pilot astronaut = spaceportTeamFactory.getPilot();
        Dispatcher spaceDispatcher = spaceportTeamFactory.getDispatcher();
        Aeromechanic spacecraftEngineer = spaceportTeamFactory.getAeromechanic();

        System.out.println("Open new spaceport.");
        spaceDispatcher.coordinate();
        spacecraftEngineer.repair();
        astronaut.fly();
    }
}
