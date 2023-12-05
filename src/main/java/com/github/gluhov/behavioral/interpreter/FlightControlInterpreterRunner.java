package com.github.gluhov.behavioral.interpreter;

public class FlightControlInterpreterRunner {
    public static void main(String[] args) {
        FlightControlInterpreter interpreter = new FlightControlInterpreter();
        Context context = new Context();

        interpreter.loadCommands("takeoff land");
        interpreter.interpretCommands(context);
    }
}