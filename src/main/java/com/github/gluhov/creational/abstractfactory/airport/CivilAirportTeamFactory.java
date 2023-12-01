package com.github.gluhov.creational.abstractfactory.airport;

import com.github.gluhov.creational.abstractfactory.Aeromechanic;
import com.github.gluhov.creational.abstractfactory.AirportTeamFactory;
import com.github.gluhov.creational.abstractfactory.Dispatcher;
import com.github.gluhov.creational.abstractfactory.Pilot;

public class CivilAirportTeamFactory implements AirportTeamFactory {
    @Override
    public Dispatcher getDispatcher() {
        return new CivilDispatcher();
    }

    @Override
    public Pilot getPilot() {
        return new CivilPilot();
    }

    @Override
    public Aeromechanic getAeromechanic() {
        return new CivilAeromechanic();
    }
}
