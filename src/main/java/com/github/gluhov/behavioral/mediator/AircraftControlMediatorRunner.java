package com.github.gluhov.behavioral.mediator;

public class AircraftControlMediatorRunner {
    public static void main(String[] args) {
        AircraftControlMediator aircraftControlMediator = new AircraftControlMediator();

        Component blackbox = new BlackBox(aircraftControlMediator, "blackbox");
        Component engine = new Engine(aircraftControlMediator, "engine");
        Component navigation = new Navigation(aircraftControlMediator, "navigation");

        aircraftControlMediator.setBlackBox(blackbox);
        aircraftControlMediator.addComponent(engine);
        aircraftControlMediator.addComponent(navigation);

        engine.sendMessage("Engine started");
        navigation.sendMessage("Route calculation is done");
    }
}