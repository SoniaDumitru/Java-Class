package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scannerInput.hasNextInt();

            if (isAnInt) {
                int number = scannerInput.nextInt();
                // execute this if statement once
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scannerInput.nextLine(); // handle input
        }
        System.out.println("min = " + min + ", max = " + max);
        scannerInput.close();
    }
}
