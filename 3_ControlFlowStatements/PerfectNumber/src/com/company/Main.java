package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        } if (number >= 1) {
            int sum = 0;
            for (int i = 1; i < number; i++ ) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return (sum == number);
        }
        return false;
    }

}
