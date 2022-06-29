package com.qa.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    static Person p0 = new Person();
    static Person p1 = new Person("Feiza");
    static Person p2 = new Person("Andrew", 36);
    static Person p3 = new Person(49, "astronaut");
    static Person p4 = new Person("harriet", "historian");
    static Person p5 = new Person("James", 64, "poet");

    static ArrayList <Person> people = new ArrayList<>();

    public static void main(String[] args) {
        p0.setName("Jordan");
        p0.setAge(16);
        p0.setJobTitle("gardener");

        p1.setAge(25);
        p1.setJobTitle("carpenter");

        p2.setJobTitle("actor");

        p3.setName("Ed");

        addPeople();

        String searchName;
        //Person foundPerson;

        do{
            searchName = promptName();
            //foundPerson = findPerson(searchName);
            //outputPerson(foundPerson);
            outputPerson(findPerson(searchName));
        } while(!searchName.equals("*"));

    }

    public static void addPeople(){
        people.add(p0);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
    }

    public static Person findPerson(String searchName){

        for (Person person : people) {
            if (person.getName().equals(searchName)) {
                System.out.println("FOUND!");
                return person;
            }
        }
        System.out.println("ERROR " + searchName + " NOT FOUND");

        return null;
    }

    public static void outputPerson(Person person) {
        if(person != null) {
            person.printPerson();
        }
    }

    public static String promptName() {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the name you want to find or type '*' ");
        return scan.next();

    }

}