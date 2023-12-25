package com.github.gluhov.behavioral.interpreter;

public class FlightControlInterpreterRunner {
    private final Context context;

    public FlightControlInterpreterRunner(Context context) {
        this.context = context;
    }

    public static void main(String[] args) {
        String landExpression = "land";
        String takeoffExpression = "takeoff";
        String autopilotExpression = "autopilot";

        FlightControlInterpreterRunner expression = new FlightControlInterpreterRunner(new Context());
        expression.interpret(takeoffExpression);
        expression.interpret(autopilotExpression);
        expression.interpret(landExpression);
    }

    private void interpret(String command) {
        Expression expression;
        if (command.contains("land")) {
            expression = new LandExpression();
            expression.interpret(context);
        } else if (command.contains("takeoff")) {
            expression = new TakeoffExpression();
            expression.interpret(context);
        } else if (command.contains("autopilot")) {
            expression = new AutopilotExpression(new AltitudeExpression(10000), new CourseExpression(90));
            expression.interpret(context);
        } else {
            System.out.println("Command not found.");
        }
    }
}