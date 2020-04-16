package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(606));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } while (number > 0) {
            int lastNumber = number % 10;
            if (lastNumber % 2 == 0) {
                sum += lastNumber;
            }
            number = number / 10;
        }
        return sum;
    }
}
