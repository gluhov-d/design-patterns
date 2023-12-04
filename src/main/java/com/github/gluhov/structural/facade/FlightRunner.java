package com.github.gluhov.structural.facade;

public class FlightRunner {
    public static void main(String[] args) {
        AvionicsFacade avionicsFacade = new AvionicsFacade();

        avionicsFacade.takeOff();
        avionicsFacade.landing();
    }
}
