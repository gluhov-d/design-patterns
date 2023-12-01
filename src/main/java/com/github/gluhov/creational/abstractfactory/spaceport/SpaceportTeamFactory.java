package com.github.gluhov.creational.abstractfactory.spaceport;

import com.github.gluhov.creational.abstractfactory.Aeromechanic;
import com.github.gluhov.creational.abstractfactory.AirportTeamFactory;
import com.github.gluhov.creational.abstractfactory.Dispatcher;
import com.github.gluhov.creational.abstractfactory.Pilot;

public class SpaceportTeamFactory implements AirportTeamFactory {
    @Override
    public Dispatcher getDispatcher() {
        return new SpaceDispatcher();
    }

    @Override
    public Pilot getPilot() {
        return new Astronaut();
    }

    @Override
    public Aeromechanic getAeromechanic() {
        return new SpacecraftEngineer();
    }
}
