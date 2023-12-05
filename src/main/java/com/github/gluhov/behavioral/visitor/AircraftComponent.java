package com.github.gluhov.behavioral.visitor;

public interface AircraftComponent {
    public void accept(AircraftComponentVisitor visitor);
}