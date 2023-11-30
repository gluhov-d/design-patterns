package com.github.gluhov.creational.factory;

public class Helicopter implements Aircraft {

    @Override
    public void fly() {
        System.out.println("Fly by helicopter!");
    }
}
