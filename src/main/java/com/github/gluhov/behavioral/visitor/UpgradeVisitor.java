package com.github.gluhov.behavioral.visitor;

public class UpgradeVisitor implements AircraftComponentVisitor{
    @Override
    public void visit(Engine engine) {
        System.out.println("Upgrading engine with new firmware");
    }

    @Override
    public void visit(Wing wing) {
        System.out.println("Installing new wing sensors");
    }

    @Override
    public void visit(Cockpit cockpit) {
        System.out.println("Upgrading cockpit avionics");
    }
}