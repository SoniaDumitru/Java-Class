package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        int i = 0;
        // if is negative or does not have any prime numbers
        if (number <= 1) {
            return -1;
        } else {
            for (i = 2; i <= number; i++) {
                // if the number is divisible by i
                if (number % i == 0) {
                    // divide the number by "i"
                    number = number / i;
                    i--;
                }
            }
            return i;
        }
    }
}
