package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

	    // switch statement
        int switchValue = 3;
	    switch (switchValue) {
            case 1:
                System.out.println("Value was one");
                // break terminates the inclosing switch statement
                break;
            case 2:
                System.out.println("Value was two");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3, or 4 or 5");
                System.out.println("Actually was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        // Challenge

        char charValue = 'A';
	    switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("charValue + " + charValue);
                break;
            default:
                System.out.println("Could not be found!");
                break;
        }

        // Challenge
        String month = "jAnuAry";
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june" :
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure!");
        }
    }
}
