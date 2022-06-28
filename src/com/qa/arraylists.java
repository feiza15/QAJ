package com.qa;

import java.util.ArrayList;
import java.util.Collections;

public class arraylists {

    public static void main(String[] args) {
        ArrayList<String> sammich = new ArrayList<>();

        //adding to the arraylist
        sammich.add("pbj");
        sammich.add("blt");
        sammich.add("club");
        //printing the arraylist as it is
        System.out.println(sammich);
        //print the arraylist using a normal forloop
        for (int i = 0; i < sammich.size(); i++) {
            System.out.println(sammich.get(i));
        }
        //print the arraylist with a for-each loop
        for (String s: sammich) {
            System.out.println(s);
        }
        //set a different value to an element in the array
        sammich.set(1, "grilled cheese");
        System.out.println(sammich);

        //remove an element
        sammich.remove(0);
        System.out.println(sammich);

        //sorting the list after adding a few elements
        sammich.add("pbj");
        sammich.add("blt");
        //prints the order of the current arraylist
        System.out.println(sammich);
        //sort
        Collections.sort(sammich);
        System.out.println(sammich);
    }
}
