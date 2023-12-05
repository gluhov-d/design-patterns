package com.github.gluhov.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class AircraftMaintenance {
    public static void main(String[] args) {
        List<AircraftComponent> components = Arrays.asList(new Engine(), new Wing(), new Cockpit());
        MaintenanceVisitor maintenance = new MaintenanceVisitor();
        UpgradeVisitor upgrade = new UpgradeVisitor();

        for (AircraftComponent component : components) {
            component.accept(maintenance);
        }

        System.out.println("\n================================\n");

        for (AircraftComponent component : components) {
            component.accept(upgrade);
        }
    }
}