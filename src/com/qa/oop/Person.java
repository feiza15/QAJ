package com.qa.oop;

public class Person {

    private String name;
    private int age;
    private String jobTitle;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String jobTitle) {
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public Person(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 125) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void printPerson() {
            System.out.println("name: " + name);
            System.out.println("age: " + age);
            System.out.println("Job Title: " + jobTitle);

    }
}