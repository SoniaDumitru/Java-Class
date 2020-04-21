package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,100));
    }
    public static int getGreatestCommonDivisor(int numOne, int numTwo) {
        if (numOne < 10 || numTwo < 10) {
            return -1;
        }
        int commonDivisor = 0;
        int smallerValue = 0;
        if (numOne < numTwo) {
            smallerValue = numOne;
        } else {
            smallerValue = numTwo;
        }
        for (int i = 1; i <= smallerValue; i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}
