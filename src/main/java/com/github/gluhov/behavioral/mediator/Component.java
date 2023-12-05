package com.github.gluhov.behavioral.mediator;

public interface Component {
    public void sendMessage(String message);
    public void receiveMessage(String message);
}