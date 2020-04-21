package com.company;

public class Main {

    public static void main(String[] args) {
        // byte can oly hold a number in the range of -128 to 127
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "Sonia";
        System.out.println("myString is equal to: " + myString);

        myString = myString + " are mere";
        System.out.println(myString);

        myString = myString + " \u00A9 2020";

        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "44.95";
        System.out.println(numberString);

        String lastString = "1";
        int myInt = 5;
        lastString = lastString + myInt;
        System.out.println("Last is equal to " + lastString);

        double doubleNumber = 1.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
