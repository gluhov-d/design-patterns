package com.github.gluhov.behavioral.template;

public class MilitaryAircraftChecklist extends PreFlightChecklist{
    @Override
    protected void customChecks() {
        System.out.println("Performing military aircraft specific checks");
    }
}