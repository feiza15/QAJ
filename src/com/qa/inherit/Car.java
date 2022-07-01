package com.qa.inherit;

public class Car extends Vehicle{

    private int doors;
    private boolean convertible;
    private boolean roofDown;

    public Car(int maxGear, int maxPassenger, String make, int doors, boolean convertible ) {
        super(maxGear, maxPassenger, make);
        this.doors = doors;
        this.convertible = convertible;
    }

    public void roofDown(){
        if(convertible && !roofDown) {
            System.out.println("  -           \n" +
                    " --                \\\\ \n" +
                    "---   _________]_[__/_>________\n" +
                    "     /  ____ \\ <>     |  ____  \\\n" +
                    "    =\\_/ __ \\_\\_______|_/ __ \\__D\n" +
                    "________(__)_____________(__)____");
            roofDown = true;
        }
    }

    public void roofUp() {
        if(convertible && roofDown) {
            System.out.println("  ______\n" +
                    " /|_||_\\`.__\n" +
                    "(   _    _ _\\\n" +
                    "=`-(_)--(_)-' ");
            roofDown = false;
        }
    }

    public void setDoors(int doors) {
        if (doors > 1) {
            this.doors = doors;
        }
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }
}

