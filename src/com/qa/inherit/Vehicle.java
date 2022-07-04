package com.qa.inherit;

public abstract class Vehicle {

    private int maxGear;
    private int maxPassengers;
    private String make;

    static int numberOfVehicles = 0;

    private int gear;

    public Vehicle(int maxGear, int maxPassenger, String make) {
        this.maxGear = maxGear;
        this.maxPassengers = maxPassenger;
        this.make = make;

        numberOfVehicles++;
        System.out.println(numberOfVehicles);
    }

    public void pressBreak() {
        System.out.println("brrrrr");
    }

    public void pressHorn() {
        System.out.println("beeeeeeep");
    }

    public void gearUp() {
        if (gear < maxGear) {
            gear++;
        }
    }
    public void gearDown() {
        if (gear > 1) {
            gear--;
        }
    }

    public int getMaxGear() {
        return maxGear;
    }

    public void setMaxGear(int maxGear) {
        if(maxGear > 1 && maxGear <= 10) {
            this.maxGear = maxGear;
        }
        else {
            System.out.println("invalid gear");
        }
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        if(maxPassengers > 1) {
            this.maxPassengers = maxPassengers;
        }
    }

    public String getMake() {
        return make;
    }

}
