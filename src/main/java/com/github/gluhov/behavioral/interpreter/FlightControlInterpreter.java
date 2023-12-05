package com.github.gluhov.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class FlightControlInterpreter {
    private final List<Expression> expressions;

    public FlightControlInterpreter() {
        expressions = new ArrayList<>();
    }

    public void loadCommands(String commands) {
        if (commands.contains("takeoff")) {
            expressions.add(new TakeoffExpression());
        }
        if (commands.contains("land")) {
            expressions.add(new LandExpression());
        }
    }

    public void interpretCommands(Context context) {
        for (Expression expression : expressions) {
            expression.interpret(context);
        }
    }
}