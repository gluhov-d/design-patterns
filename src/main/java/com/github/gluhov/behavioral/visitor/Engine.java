package com.github.gluhov.behavioral.visitor;

public class Engine implements AircraftComponent{
    @Override
    public void accept(AircraftComponentVisitor visitor) {
        visitor.visit(this);
    }
}