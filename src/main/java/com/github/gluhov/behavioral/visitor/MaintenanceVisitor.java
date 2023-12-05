package com.github.gluhov.behavioral.visitor;

public class MaintenanceVisitor implements AircraftComponentVisitor{
    @Override
    public void visit(Engine engine) {
        System.out.println("Performing maintenance on engine");
    }

    @Override
    public void visit(Wing wing) {
        System.out.println("Inspecting wing integrity");
    }

    @Override
    public void visit(Cockpit cockpit) {
        System.out.println("Checking cockpit equipment");
    }
}