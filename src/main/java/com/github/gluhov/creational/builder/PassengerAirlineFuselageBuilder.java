package com.github.gluhov.creational.builder;

public class PassengerAirlineFuselageBuilder extends FuselageBuilder{
    @Override
    void buildName() {
        fuselage.setName("Libra Airlines");
    }

    @Override
    void buildPrice() {
        fuselage.setPrice(350);
    }

    @Override
    void buildFuselageType() {
        fuselage.setType(FuselageType.CIVIL);
    }
}
