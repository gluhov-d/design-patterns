package com.github.gluhov.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AircraftStatusMonitor implements AircraftObservable{
    private final Map<String, String> parameters;
    private final List<AircraftObserver> observers;

    public AircraftStatusMonitor() {
        this.parameters = new HashMap<>();
        this.observers = new ArrayList<>();
    }

    public void setParameter(String parameter, String value) {
        parameters.put(parameter, value);
        notifyObservers();
    }

    @Override
    public void addObserver(AircraftObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(AircraftObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (AircraftObserver observer : observers) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                observer.update(entry.getKey(), entry.getValue());
            }
        }
    }
}
