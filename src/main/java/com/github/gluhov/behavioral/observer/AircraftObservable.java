package com.github.gluhov.behavioral.observer;

public interface AircraftObservable {
    void addObserver(AircraftObserver observer);
    void removeObserver(AircraftObserver observer);
    void notifyObservers();
}
