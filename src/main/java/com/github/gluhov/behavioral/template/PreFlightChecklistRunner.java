package com.github.gluhov.behavioral.template;

public class PreFlightChecklistRunner {
    public static void main(String[] args) {
        PreFlightChecklist commercialChecklist = new CommercialAircraftChecklist();
        PreFlightChecklist militaryChecklist = new MilitaryAircraftChecklist();

        System.out.println("Commercial Aircraft Checklist:");
        commercialChecklist.performCheck();

        System.out.println("\n=================================\n");

        System.out.println("Military Aircraft Checklist:");
        militaryChecklist.performCheck();
    }
}