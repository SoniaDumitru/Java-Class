package com.company;

public class Main {

    public static void main(String[] args) {
        // if / then statement
	    boolean isAlien = true;
	    if (isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

	    int topScore = 80;
	    if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        // AND operator: &&
	    int secondScore = 60;
	    if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }
        // OR operator: ||
	    if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

	    int newValue = 50;
	    if (newValue == 50) {
            System.out.println("This is true.");
        }

	    boolean isCar = false;
	    if (!isCar) {
            System.out.println("This is supposed to happen.");
        }

	    // Ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
	    if (wasCar) {
            System.out.println("wasCar is true");
        }
        // Operator precedence
        double firstDoubleVar = 20.00d;
        double secondDoubleVar = 20.00d;

        // multiplication has higher precedence than addition
        double result = (firstDoubleVar + secondDoubleVar) * 100;
        double remainder = result % 40.00;

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);

        if (isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
