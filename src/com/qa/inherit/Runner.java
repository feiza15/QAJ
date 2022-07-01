package com.qa.inherit;

public class Runner {

    public static void main(String[] args) {
        Car c = new Car(5, 4, "tesla", 5, true);
        Motorbike m = new Motorbike(5, 2, "vespa", true);

        Garage g = new Garage();
        g.addVehicle(c);
        g.addVehicle(m);

        g.printVehicles();

        c.roofDown();
        c.roofUp();
    }
}
