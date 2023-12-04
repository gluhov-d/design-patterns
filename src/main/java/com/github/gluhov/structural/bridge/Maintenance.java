package com.github.gluhov.structural.bridge;

public abstract class Maintenance {
    protected Engineer engineer;

    protected Maintenance(Engineer engineer) {
        this.engineer = engineer;
    }

    public abstract void createMaintenanceProgram();
}
