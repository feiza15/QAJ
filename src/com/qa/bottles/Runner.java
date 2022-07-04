package com.qa.bottles;

public class Runner {

    public static void main(String[] args) {

        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                    "Take one down and pass it around," + (i-1) + " bottles of beer on the wall.");
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer. \n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
