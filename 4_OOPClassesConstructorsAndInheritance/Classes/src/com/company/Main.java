package com.company;

public class Main {

    public static void main(String[] args) {
        // created an object toyota
        Car toyota = new Car();
        // set the model for toyota
        toyota.setModel("911");
        System.out.println("Model is " + toyota.getModel());
    }
}
// Encapsulation = we're not allowing people to access the field directly, using a method we can really make sure that the data in our objects are more valid and have been validated