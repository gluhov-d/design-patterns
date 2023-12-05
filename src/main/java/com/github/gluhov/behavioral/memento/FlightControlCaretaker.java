package com.github.gluhov.behavioral.memento;

public class FlightControlCaretaker {
    private FlightControlMemento save;

    public FlightControlMemento getSave() {
        return save;
    }

    public void setSave(FlightControlMemento save) {
        this.save = save;
    }
}
