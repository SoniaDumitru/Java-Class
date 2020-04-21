package com.company;

public class Car {
    // public is an access modifier that is used to allow others to have access to this new class
    // created fields for our class = template of a car = the state of a car declared by fields

    private int doors;
    private int wheels;
    private String model;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }
}
