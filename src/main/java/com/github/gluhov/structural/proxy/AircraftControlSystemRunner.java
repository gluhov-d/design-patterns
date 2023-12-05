package com.github.gluhov.structural.proxy;

public class AircraftControlSystemRunner {
    public static void main(String[] args) {
        RealAircraftControlSystem realAircraftControlSystem = new RealAircraftControlSystem();
        ProxyAircraftControlSystem proxyAircraftControlSystem = new ProxyAircraftControlSystem(realAircraftControlSystem);

        proxyAircraftControlSystem.executeCommand("startEngine");
        proxyAircraftControlSystem.executeCommand("");
    }
}