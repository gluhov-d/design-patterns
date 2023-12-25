package com.github.gluhov.behavioral.interpreter;

public class AutopilotExpression implements Expression {
    private Expression altitudeExpression;
    private Expression courseExpression;

    public AutopilotExpression(Expression altitudeExpression, Expression courseExpression) {
        this.altitudeExpression = altitudeExpression;
        this.courseExpression = courseExpression;
    }

    @Override
    public void interpret(Context context) {
        System.out.println("Autopilot is engaged with the given settings.");
        altitudeExpression.interpret(context);
        courseExpression.interpret(context);
    }
}