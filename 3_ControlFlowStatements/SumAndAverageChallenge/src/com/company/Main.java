package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long average;

        while (true) {
            System.out.println("Enter your number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                count++;
            } else {
                average=Math.round((double)(sum)/(double)(count));
                System.out.println("SUM = "+sum+" AVG = "+average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

}
