package com.github.gluhov.behavioral.visitor;

public interface AircraftComponentVisitor {
    void visit(Engine engine);
    void visit(Wing wing);
    void visit(Cockpit cockpit);
}