package com.github.gluhov.creational.prototype;

public class LandingGear implements Copyable {
    private String type;
    private int wheelCount;

    public LandingGear(String type, int wheelCount) {
        this.type = type;
        this.wheelCount = wheelCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public Object copy() {
        LandingGear landingGear = new LandingGear(type, wheelCount);
        return landingGear;
    }

    @Override
    public String toString() {
        return "LandingGear{" +
                "type='" + type + '\'' +
                ", wheelCount=" + wheelCount +
                '}';
    }
}
