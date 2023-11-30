package com.github.gluhov.creational.factory;

public class Airplane implements Aircraft{
    @Override
    public void fly() {
        System.out.println("Fly by airplane!");
    }
}
