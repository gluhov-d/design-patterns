package com.github.gluhov.creational.abstractfactory.airport;

import com.github.gluhov.creational.abstractfactory.Dispatcher;

public class CivilDispatcher implements Dispatcher {
    @Override
    public void coordinate() {
        System.out.println("Civil dispatcher coordinates civil planes.");
    }
}
