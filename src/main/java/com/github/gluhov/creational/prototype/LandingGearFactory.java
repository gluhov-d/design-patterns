package com.github.gluhov.creational.prototype;

public class LandingGearFactory {
    LandingGear landingGear;

    public LandingGearFactory(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    LandingGear cloneLandingGear() {
        return (LandingGear) landingGear.copy();
    }
}
