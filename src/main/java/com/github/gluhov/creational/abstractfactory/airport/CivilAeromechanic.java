package com.github.gluhov.creational.abstractfactory.airport;

import com.github.gluhov.creational.abstractfactory.Aeromechanic;

public class CivilAeromechanic implements Aeromechanic {
    @Override
    public void repair() {
        System.out.println("Civil aeromechanic repairs civil planes.");
    }
}
