package com.github.gluhov.creational.builder;

public class ChiefEngineer {
    FuselageBuilder fuselageBuilder;

    public void setFuselageBuilder(FuselageBuilder fuselageBuilder) {
        this.fuselageBuilder = fuselageBuilder;
    }

    Fuselage buildFuselage() {
        fuselageBuilder.createFuselage();
        fuselageBuilder.buildName();
        fuselageBuilder.buildFuselageType();
        fuselageBuilder.buildPrice();

        Fuselage fuselage = fuselageBuilder.getFuselage();
        return fuselage;
    }
}
