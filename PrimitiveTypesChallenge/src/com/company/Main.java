package com.company;

public class Main {

    public static void main(String[] args) {
	    byte byteValue = 10;
	    short shortValue = 32766;
	    int intValue = 12000;

	    long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
	    System.out.println(longTotal);

	    short shortTotal = (short)(1000 + 10 * (byteValue + shortValue));
		System.out.println(shortTotal);
	}
}
