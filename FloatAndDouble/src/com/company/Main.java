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

        int myIntValue = 5;
        float myFloatValue = (float)5.25;
        double myDoubleValue = 5.25d;
    }
}
