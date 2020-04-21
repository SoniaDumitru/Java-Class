package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while (count != 6) {
//            System.out.println("Count value in WHILE is " + count);
//            count++;
//        }
//        // this for loop is not the same as the one above
//	    for (int i = 0; i < 7; i++) {
//            System.out.println("Count value in FOR is " + count);
//        }
//        // this for loop is the same
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value in FOR is " + count);
//        }
//
//        // this while loop is the same
//        count = 1;
//        while(true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        // do while loop, which executes at least once always
//        count = 6;
//        do {
//            System.out.println("Count value in DO WHILE WAS " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

        int number = 2;
        int finishNumber = 10;
        int countEven = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            countEven++;
            if (countEven == 6) {
                break;
            }
        }
        System.out.println(countEven);
    }
        // Create isEvenNumber(int number), determine if number is even
        public static boolean isEvenNumber ( int number){
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
        }
}
