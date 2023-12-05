package com.github.gluhov.behavioral.mediator;

public class Engine implements Component {
    AircraftMediator aircraftMediator;
    String name;

    public Engine(AircraftMediator aircraftMediator, String name) {
        this.aircraftMediator = aircraftMediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Component " + this.name + " sending message " + message);
        aircraftMediator.notify(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Component " + this.name + " receiving message: " + message + ".");
    }
}