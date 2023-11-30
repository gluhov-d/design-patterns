package com.github.gluhov.creational.factory;

public class Rocket implements Aircraft{
    @Override
    public void fly() {
        System.out.println("Fly by rocket!!!");
    }
}
