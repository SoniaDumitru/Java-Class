package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int counter = 0;
	    int sum = 0;
	    // a loop that never completes - endless loop
	    while (true) {
	        int order = counter + 1;
            System.out.println("Enter number # " + order + ":");
            boolean isAnInt = scanner.hasNextInt(); // check is the user entered an int

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 3) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle Enter Key
        }
        System.out.println("sum = " + sum);
	    scanner.close();
    }

}
