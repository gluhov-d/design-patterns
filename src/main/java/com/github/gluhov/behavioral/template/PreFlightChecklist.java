package com.github.gluhov.behavioral.template;

public abstract class PreFlightChecklist {
    public final void performCheck() {
        checkFuel();
        checkEngine();
        customChecks(); 
        readyForDeparture();
    }

    private void readyForDeparture() {
        System.out.println("Aircraft is ready for departure.");
    }

    protected abstract void customChecks();

    private void checkEngine() {
        System.out.println("Checking engines.");
    }

    private void checkFuel() {
        System.out.println("Checking fuel.");
    }
}