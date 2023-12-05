package com.github.gluhov.behavioral.mediator;

public interface Component {
    void sendMessage(String message);
    void receiveMessage(String message);
}