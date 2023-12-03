package com.github.gluhov.structural.adapter;

public class EngineerMonitoringSystemRunner {
    public static void main(String[] args) {
        EngineerMonitoringSystem engineerMonitoringSystem = new AdapterLegacyToEngineerMonitoring();
        engineerMonitoringSystem.connect();
        engineerMonitoringSystem.monitorEngine();
    }
}
