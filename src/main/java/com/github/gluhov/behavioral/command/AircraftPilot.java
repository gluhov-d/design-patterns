package com.github.gluhov.behavioral.command;

public class AircraftPilot {
    AircraftCommand communicate;
    AircraftCommand navigate;

    public AircraftPilot(AircraftCommand communicate, AircraftCommand navigate) {
        this.communicate = communicate;
        this.navigate = navigate;
    }

    public void communicate() {
        communicate.execute();
    }

    public void navigate() {
        navigate.execute();
    }
}