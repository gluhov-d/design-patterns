package com.github.gluhov.structural.bridge;

public class ElectricalEngineer implements Engineer{
    @Override
    public void maintain() {
        System.out.println("Service electrical systems");
    }
}
