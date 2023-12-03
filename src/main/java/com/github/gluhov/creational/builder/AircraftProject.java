package com.github.gluhov.creational.builder;

public class AircraftProject {

    public static void main(String[] args) {
        ChiefEngineer chiefEngineer = new ChiefEngineer();
        chiefEngineer.setFuselageBuilder(new MilitaryAircraftFuselageBuilder());

        Fuselage fuselage = chiefEngineer.buildFuselage();

        System.out.println(fuselage);

        chiefEngineer.setFuselageBuilder(new PassengerAirlineFuselageBuilder());

        fuselage = chiefEngineer.buildFuselage();

        System.out.println(fuselage);
    }
}
