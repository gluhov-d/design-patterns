package com.github.gluhov.behavioral.memento;

public class FlightControlSystem {
    private String currentState;

    public void setState(String state) {
        this.currentState = state;
    }

    public String getState() {
        return currentState;
    }

    public FlightControlMemento save() {
        return new FlightControlMemento(currentState);
    }

    public void restore(FlightControlMemento memento) {
        this.currentState = memento.getState();
    }

    @Override
    public String toString() {
        return "FlightControlSystem: " +
                "currentState=" + currentState + ";";
    }
}
