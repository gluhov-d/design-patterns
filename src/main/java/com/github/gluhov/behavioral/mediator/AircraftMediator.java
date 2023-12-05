package com.github.gluhov.behavioral.mediator;

public interface AircraftMediator {
    void notify(Component sender, String event);
}