package com.github.gluhov.creational.abstractfactory.spaceport;

import com.github.gluhov.creational.abstractfactory.Aeromechanic;

public class SpacecraftEngineer implements Aeromechanic {
    @Override
    public void repair() {
        System.out.println("Spacecraft engineer repairs rockets.");
    }
}
