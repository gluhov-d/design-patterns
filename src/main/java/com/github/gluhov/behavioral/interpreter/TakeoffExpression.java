package com.github.gluhov.behavioral.interpreter;

public class TakeoffExpression implements Expression {
    @Override
    public void interpret(Context context) {
        context.takeoff();
    }
}