package com.github.gluhov.creational.abstractfactory.spaceport;

import com.github.gluhov.creational.abstractfactory.Dispatcher;

public class SpaceDispatcher implements Dispatcher {
    @Override
    public void coordinate() {
        System.out.println("Space dispatcher coordinates rocket start.");
    }
}
