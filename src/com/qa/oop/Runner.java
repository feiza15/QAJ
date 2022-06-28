package com.qa.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Person p0 = new Person();
        Person p1 = new Person("Feiza");
        Person p2 = new Person("Andrew", 36);
        Person p3 = new Person(49, "astronaut");
        Person p4 = new Person("harriet", "historian");
        Person p5 = new Person("James", 64, "poet");

        p0.setName("Jordan");
        p0.setAge(16);
        p0.setJobTitle("gardener");

        p1.setAge(25);
        p1.setJobTitle("carpenter");

        p2.setJobTitle("actor");

        p3.setName("Ed");

        ArrayList <Person> people = new ArrayList<>();
        people.add(p0);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name you want to find");
        String searchName = scan.next();

        boolean found = false;

        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).getName().equals(searchName)) {
                found = true;
                System.out.println("FOUND!");
                System.out.println("name: " + searchName);
                System.out.println("age: " + people.get(i).getAge());
                System.out.println("Job Title: " + people.get(i).getJobTitle());
            }
        }

        if(!found) {
            System.out.println("ERROR " + searchName + " NOT FOUND");
        }
    }
}
