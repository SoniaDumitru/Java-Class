package com.company;

class Dog {
//    private static String name;
//
//    public Dog(String name) {
//        Dog.name = name;
//    }

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
public class Main {

    public static void main(String[] args) {
	    Dog azorica = new Dog("Azorica"); // create instance azorica
	    Dog fluffy = new Dog("Fluffy"); // create instance (Fluffy)
        azorica.printName();
        fluffy.printName();

    }
}
