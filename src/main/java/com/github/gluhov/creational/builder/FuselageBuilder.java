package com.github.gluhov.creational.builder;

public abstract class FuselageBuilder {
    Fuselage fuselage;

    void createFuselage() {
        fuselage = new Fuselage();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildFuselageType();

    Fuselage getFuselage() {
        return fuselage;
    }
}
