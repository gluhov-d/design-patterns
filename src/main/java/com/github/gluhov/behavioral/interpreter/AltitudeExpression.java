package com.github.gluhov.behavioral.interpreter;

public class AltitudeExpression implements Expression {
    private final int altitude;

    public AltitudeExpression(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public void interpret(Context context) {
        context.setAltitude(altitude);
    }
}