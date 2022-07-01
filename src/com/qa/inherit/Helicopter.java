package com.qa.inherit;

public class Helicopter extends Vehicle{

    private int numberOfBlades;
    private boolean floatOnWater;

    //public Vehicle(int maxGear, int maxPassenger) {
    public Helicopter(int maxGear, int maxPassenger, String make, int numberOfBlades, boolean floatOnWater) {
        super(maxGear, maxPassenger, make);
        this.numberOfBlades = numberOfBlades;
        this.floatOnWater = floatOnWater;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }
}
