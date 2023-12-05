package com.github.gluhov.behavioral.interpreter;

public class LandExpression implements Expression {
    @Override
    public void interpret(Context context) {
        context.land();
    }
}