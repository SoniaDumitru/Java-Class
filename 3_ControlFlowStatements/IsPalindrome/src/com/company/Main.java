package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int originalNumber = number;

        do {
            lastDigit = (number % 10);
            number = number / 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
        } while (number != 0);
        return reverse == originalNumber;
    }
}
