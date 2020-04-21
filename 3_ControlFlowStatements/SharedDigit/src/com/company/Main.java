package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        int firstDigitNumberOne = numberOne % 10;
        int lastDigitNumberOne = numberTwo / 10;
        int firsDigitNumberTwo = numberTwo % 10;
        int lastDigitNumberTwo = numberTwo / 10;
        if ((numberOne < 10 || numberOne > 99) && (numberTwo < 10 || numberTwo > 99)) {
            return false;
        } else if ((firstDigitNumberOne == firsDigitNumberTwo) || (lastDigitNumberOne == lastDigitNumberTwo) ||
                (firstDigitNumberOne ==  lastDigitNumberTwo) || (lastDigitNumberOne == firsDigitNumberTwo)) {
            return true;
        } else {
            return false;
        }
    }
}
