package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

    }
}
