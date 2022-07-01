package com.qa.inherit;

public class Motorbike extends Vehicle {

    private boolean sideCar;

    public Motorbike(int maxGear, int maxPassenger, String make, boolean sideCar ) {
        super(maxGear, maxPassenger, make);
        this.sideCar = sideCar;
        //printMotorbike();
    }

    public boolean hasSideCar() {
        return sideCar;
    }

    private void printMotorbike() {
        if(sideCar) {
            System.out.println("");
        }
    }
}
