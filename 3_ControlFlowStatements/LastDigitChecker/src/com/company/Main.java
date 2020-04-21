package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10,204,401));
    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        if (isValid(numOne) && isValid(numTwo) && isValid(numThree)) {
            int rightOne = numOne % 10;
            int rightTwo = numTwo % 10;
            int rightThree = numThree % 10;
            if (rightOne == rightTwo || rightOne == rightThree || rightTwo == rightThree) {
            return true;
        }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
