package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i< myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.printf("The average is " + average(myIntegers));
//        int[] myIntArray= new int[10];
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i;
//        }
//        printArray(myIntArray);
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }

//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }


}