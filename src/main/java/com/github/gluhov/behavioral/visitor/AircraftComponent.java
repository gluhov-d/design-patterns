package com.github.gluhov.behavioral.visitor;

public interface AircraftComponent {
    void accept(AircraftComponentVisitor visitor);
}