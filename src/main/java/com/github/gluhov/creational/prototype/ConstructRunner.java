package com.github.gluhov.creational.prototype;

public class ConstructRunner {
    public static void main(String[] args) {
        LandingGear landingGear = new LandingGear("Main landing gear", 3);
        System.out.println(landingGear);

        LandingGearFactory landingGearFactory = new LandingGearFactory(landingGear);
        LandingGear landingGearClone = landingGearFactory.cloneLandingGear();
        System.out.println("\n==========================\n");
        System.out.println(landingGearClone);
        landingGearClone.setType("Nose landing gear");
        landingGearClone.setWheelCount(2);
        System.out.println("\n==========================\n");
        System.out.println(landingGearClone);
    }
}