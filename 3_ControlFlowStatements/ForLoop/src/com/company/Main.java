package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2 % interest = " + calculateInterest(10000.00, 2.00));
        System.out.println("10,000 at 3 % interest = " + calculateInterest(10000.00, 3.00));
        System.out.println("10,000 at 4 % interest = " + calculateInterest(10000.00, 4.00));

        // "for" repeats the loop until a condition is satisfied: for (init, termination, increment)
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++) {
            // parsing the value to String.format: "%.2f" =>  convert the number to only 2 decimals
            System.out.println("10,000 at " + i +  "% interest = " + String.format("%.2f",calculateInterest(10000.00, i)));
        }
        System.out.println("******************************************************");
        for (int i = 9; i >= 2; i--) {
            System.out.println("10,000 at " + i +  "% interest = " + String.format("%.2f",calculateInterest(10000.00, i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting the loop...");
                    break;
                }
            }
        }
    }


    // prime number challenge
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

}
