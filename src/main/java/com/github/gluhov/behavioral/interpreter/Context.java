package com.github.gluhov.behavioral.interpreter;

public class Context {
    private int altitude;
    private int course;

    public void setAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println("Setting altitude to " + altitude + " meters");
    }

    public void setCourse(int course) {
        this.course = course;
        System.out.println("Setting course to " + course + " degrees");
    }
    public void takeoff() {
        System.out.println("The aircraft is taking off");
    }

    public void land() {
        System.out.println("The aircraft is landing");
    }
}