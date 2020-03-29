package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My min float value: " + myMinFloatValue);
        System.out.println("My max float value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("My min double value: " + myMinDoubleValue);
        System.out.println("My max double value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3.00;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        /* Challenge to convert pounds to kg. */
        double numberOfPounds = 138d;
        double resultKg = numberOfPounds * 0.45359237d;
        System.out.println(resultKg);

        double pi = 3.1415927d;
        double anotherNumber = 3_987_767.4_455_098;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
