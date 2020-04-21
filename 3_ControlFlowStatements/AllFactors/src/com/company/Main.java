package com.company;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
    }
    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                System.out.println(num/i);
            }
        }
    }
}
