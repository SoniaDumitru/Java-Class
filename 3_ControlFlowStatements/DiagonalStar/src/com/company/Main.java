package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
//                    * in the first or last row || * in te first or last column || * when the row number equals the column number || * when the column = rowCount - currentRow + 1 (for diagonals)
                    if ((row == 1) || (column == 1) || (column == number) || (row == column) || (column == (number - row) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
