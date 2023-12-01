package com.github.gluhov.creational.abstractfactory;

public interface AirportTeamFactory {
    Dispatcher getDispatcher();
    Pilot getPilot();
    Aeromechanic getAeromechanic();
}
