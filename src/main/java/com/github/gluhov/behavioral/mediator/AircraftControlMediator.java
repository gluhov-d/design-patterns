package com.github.gluhov.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AircraftControlMediator implements AircraftMediator{
    public Component blackBox;
    public List<Component> components = new ArrayList<>();

    public void setBlackBox(Component blackBox) {
        this.blackBox = blackBox;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof Engine) {
            blackBox.receiveMessage("Engine status changed: " + event);
        } else if (sender instanceof Navigation) {
            blackBox.receiveMessage("Navigation status changed: " + event);
        }
    }
}