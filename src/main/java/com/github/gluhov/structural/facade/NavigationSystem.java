package com.github.gluhov.structural.facade;

public class NavigationSystem {
    private boolean approachCalculated;

    public boolean isApproachCalculated(){
        return approachCalculated;
    }

    public void initialize() {
        System.out.println("Starting navigation system.");
        approachCalculated = false;
    }

    public void calculateApproach() {
        System.out.println("Calculating approach for landing.");
        approachCalculated = true;
    }
}
