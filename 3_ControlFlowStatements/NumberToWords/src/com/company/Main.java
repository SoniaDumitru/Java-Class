package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(12);
    }
    // method to print digits to words
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if(number>=0){
            int reversedNum = reverse(number);
            int extraZeroes = getDigitCount(number) - getDigitCount(reversedNum);
            if(number==0){
                System.out.println("Zero");
            }
            for (int i = reversedNum; i > 0; i /= 10) {
                switch (i % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
            for (int i = extraZeroes; i > 0; i--) {
                System.out.println("Zero");
            }
        }
    }
    // method to reverse number
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = ((reversedNumber * 10) + (number % 10));
            number /= 10;
        }
        return reversedNumber;
    }
    // method to count digits
    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else if(number>0){
            for (int i = number; i > 0; i /= 10) {
                count++;
            }
        } return count;
    }
}
