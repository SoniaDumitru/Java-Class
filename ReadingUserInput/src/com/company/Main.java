package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in); // Scanner Class

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // if the input is not a number will return false
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle the problem with Enter Key

            System.out.println("Enter your name: " );
            String name = scanner.nextLine(); // read a line from the input with .nextLine()

            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println(" Your name is " + name + " and you are " + age + " years old"); // retrieve the info from the console
            } else {
                System.out.println("Invalid year of birth!");
            }
        } else {
            System.out.println("Invalid Year Value!");
        }
        scanner.close(); // close the scanner to clear the memory
    }
}
