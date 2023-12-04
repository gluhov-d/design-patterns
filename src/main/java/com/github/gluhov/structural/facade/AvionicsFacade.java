package com.github.gluhov.structural.facade;

public class AvionicsFacade {
    private final NavigationSystem navigationsSystem;
    private final CommunicationSystem communicationSystem;
    private final EngineControlSystem engineControlSystem;

    public AvionicsFacade() {
        this.navigationsSystem = new NavigationSystem();
        this.communicationSystem = new CommunicationSystem();
        this.engineControlSystem = new EngineControlSystem();
    }

    public void takeOff() {
        navigationsSystem.initialize();
        communicationSystem.connect();
        engineControlSystem.startEngines();
    }

    public void landing() {
        navigationsSystem.calculateApproach();
        communicationSystem.notifyGround(navigationsSystem);
        engineControlSystem.decelerate();
    }

}
