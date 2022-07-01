package com.qa.inherit;

import java.util.ArrayList;

public class Garage {

    private ArrayList <Vehicle> v = new ArrayList<>();


    public void addVehicle(Vehicle vehicle) {
        v.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        v.remove(vehicle);
    }

    public void removeVehicle(String make){
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i).getMake().equals(make)) {
                v.remove(i);
            }
        }
    }

    public void emptyGarage() {
        v.clear();
    }

    public void calculateBill(Vehicle vehicle) {
        if(vehicle instanceof Motorbike) {
            System.out.println("£150");
        }
        else if(vehicle instanceof Car) {
            System.out.println("£300");
        }
        else {
            System.out.println("£1500");
        }
    }

    public void printVehicles() {
        System.out.println(v);
    }
}
