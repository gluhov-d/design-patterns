package com.github.gluhov.behavioral.memento;

public class FlightControlSystemRunner {
    public static void main(String[] args) {
        FlightControlSystem controlSystem = new FlightControlSystem();
        FlightControlCaretaker caretaker = new FlightControlCaretaker();

        System.out.println("Flight control system start working.");

        controlSystem.setState("Normal Operation");
        caretaker.setSave(controlSystem.save());
        System.out.println(controlSystem);

        System.out.println("Something going wrong.");
        controlSystem.setState("Critical Alert");
        System.out.println(controlSystem);

        System.out.println("Restore system.");
        controlSystem.restore(caretaker.getSave());
        System.out.println("Current System State: " + controlSystem.getState());
    }
}
