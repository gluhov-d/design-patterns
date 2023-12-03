package com.github.gluhov.creational.builder;

public class MilitaryAircraftFuselageBuilder extends FuselageBuilder{
    @Override
    void buildName() {
        fuselage.setName("Epoch 5");
    }

    @Override
    void buildPrice() {
        fuselage.setPrice(750);
    }

    @Override
    void buildFuselageType() {
        fuselage.setType(FuselageType.MILITARY);
    }
}
