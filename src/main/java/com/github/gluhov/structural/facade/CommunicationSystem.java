package com.github.gluhov.structural.facade;

public class CommunicationSystem {
    public void connect() {
        System.out.println("Connecting to radio channel.");
    }

    public void notifyGround(NavigationSystem navigationSystem) {
        if (navigationSystem.isApproachCalculated()) {
            System.out.println("Notifying ground about landing.");
        } else {
            System.out.println("Notify ground about problems with navigation system.");
        }

    }
}
