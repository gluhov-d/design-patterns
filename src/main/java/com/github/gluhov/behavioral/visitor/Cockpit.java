package com.github.gluhov.behavioral.visitor;

public class Cockpit implements AircraftComponent{
    @Override
    public void accept(AircraftComponentVisitor visitor) {
        visitor.visit(this);
    }
}