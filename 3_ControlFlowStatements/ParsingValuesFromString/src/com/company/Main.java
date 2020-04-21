package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2020.2";
        System.out.println("This is a string: " +  numberAsString);

        // parse is a static method and Double is a wrapper class
        double number = Double.parseDouble(numberAsString);
        System.out.println("This is a number: " + number);

        numberAsString += 9;
        number += 9;

        System.out.println("This is a string: " + numberAsString);
        System.out.println("This is a number: " + number);
    }
}
