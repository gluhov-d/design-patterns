package com.github.gluhov.creational.abstractfactory.airport;

import com.github.gluhov.creational.abstractfactory.Pilot;

public class CivilPilot implements Pilot {
    @Override
    public void fly() {
        System.out.println("Civil pilot flyes on the civil plane.");
    }
}
