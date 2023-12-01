package com.github.gluhov.creational.abstractfactory.spaceport;

import com.github.gluhov.creational.abstractfactory.Pilot;

public class Astronaut implements Pilot {
    @Override
    public void fly() {
        System.out.println("Astronaut flyes on the rocket.");
    }
}
