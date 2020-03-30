package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);

        int previousResult = result;
        System.out.println(previousResult);

        result = result -1; // 3 - 1 = 2

        System.out.println(result);
        System.out.println(previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        // modulus or remainder
        result = result % 3; // ( 4 % 3 = 1)
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        // result = result * 10;
        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

    }
}
