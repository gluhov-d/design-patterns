package com.github.gluhov.structural.flyweight;

public class LocalAirport implements Airport{
    @Override
    public void getInfo() {
        System.out.println("Information about local airport.");
    }
}
