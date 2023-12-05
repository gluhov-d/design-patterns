package com.github.gluhov.behavioral.template;

public class CommercialAircraftChecklist extends PreFlightChecklist{
    @Override
    protected void customChecks() {
        System.out.println("Performing commercial aircraft specific checks");
    }
}