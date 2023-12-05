package com.github.gluhov.behavioral.visitor;

public interface AircraftComponentVisitor {
    public void visit(Engine engine);
    public void visit(Wing wing);
    public void visit(Cockpit cockpit);
}