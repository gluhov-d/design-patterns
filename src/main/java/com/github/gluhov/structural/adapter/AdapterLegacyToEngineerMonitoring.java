package com.github.gluhov.structural.adapter;

public class AdapterLegacyToEngineerMonitoring extends LegacySystem implements EngineerMonitoringSystem{
    @Override
    public void connect() {
        initializeConnection();
    }

    @Override
    public void monitorEngine() {
        startMonitoring();
    }
}
