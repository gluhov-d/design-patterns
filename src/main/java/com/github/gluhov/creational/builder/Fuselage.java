package com.github.gluhov.creational.builder;

public class Fuselage {
    private String name;
    private FuselageType type;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(FuselageType type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fuselage{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
