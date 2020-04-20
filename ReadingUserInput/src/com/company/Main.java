package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in); // Scanner Class
        System.out.println("Enter your name: " );
        String name = scanner.nextLine(); // read a line from the input with .nextLine()
        System.out.println(" Your name is " + name); // retrieve the info from the console

        scanner.close(); // close the scanner to clear the memory
    }
}
