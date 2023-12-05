package com.github.gluhov.behavioral.memento;

public class FlightControlMemento {
    private final String state;

    public FlightControlMemento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}
