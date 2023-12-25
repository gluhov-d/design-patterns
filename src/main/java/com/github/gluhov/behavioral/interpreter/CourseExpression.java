package com.github.gluhov.behavioral.interpreter;

public class CourseExpression implements Expression {
    private final int course;

    public CourseExpression(int course) {
        this.course = course;
    }

    @Override
    public void interpret(Context context) {
        context.setCourse(course);
    }
}