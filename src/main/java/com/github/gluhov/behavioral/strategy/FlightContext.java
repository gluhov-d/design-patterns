package com.github.gluhov.behavioral.strategy;

public class FlightContext {
    private FlightStrategy strategy;

    public void setStrategy(FlightStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute(this);
    }
}